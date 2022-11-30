package com.example.bookStore.BookStore.Service;

import com.example.bookStore.BookStore.Module.Books;
import com.example.bookStore.BookStore.Module.User;

import java.util.List;

public interface BookService {
    Books addBook(Books book);
    List<Books> getBooks();


}
