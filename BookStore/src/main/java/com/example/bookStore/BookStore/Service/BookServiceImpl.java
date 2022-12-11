package com.example.bookStore.BookStore.Service;

import com.example.bookStore.BookStore.Module.BookInventory;
import com.example.bookStore.BookStore.Module.Books;
import com.example.bookStore.BookStore.Module.User;
import com.example.bookStore.BookStore.Repository.BookInventoryRepository;
import com.example.bookStore.BookStore.Repository.BookRepository;
import com.example.bookStore.BookStore.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookInventoryRepository bookInventoryRepository;

    @Override
    public List<Books> getBooks(){
        return this.bookRepository.findAll();
    }

    @Override
    public Books addBook(Books book){
        Optional<BookInventory> bookList= bookInventoryRepository.findByBookCode(book.getBookCode());
        if(bookList.isPresent())
            bookInventoryRepository.updateBookQuantityInInventory(book.getBookCode());
        else
            bookInventoryRepository.addBookInInventory(book.getBookCode(), book.getBookName(),1);
        return bookRepository.save(book);
    }


}
