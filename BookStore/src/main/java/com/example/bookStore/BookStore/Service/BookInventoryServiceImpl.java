package com.example.bookStore.BookStore.Service;

import com.example.bookStore.BookStore.Module.BookInventory;
import com.example.bookStore.BookStore.Module.Books;
import com.example.bookStore.BookStore.Module.User;
import com.example.bookStore.BookStore.Repository.BookInventoryRepository;
import com.example.bookStore.BookStore.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BookInventoryServiceImpl implements BookInventoryService{

    @Autowired
    private BookInventoryRepository bookInventoryRepository;

    @Override
    public List<BookInventory> getBookInventory() {
        return this.bookInventoryRepository.findAll();
    }


    @Override
    public BookInventory createInv(BookInventory bookInventory) {
        return bookInventoryRepository.save(bookInventory);
    }

//    @Override
//    public BookInventory updateInv(Books book){
//    }
}

