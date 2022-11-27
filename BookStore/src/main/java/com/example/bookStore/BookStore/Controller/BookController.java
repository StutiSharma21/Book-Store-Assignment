package com.example.bookStore.BookStore.Controller;

import com.example.bookStore.BookStore.Module.Books;
import com.example.bookStore.BookStore.Module.User;
import com.example.bookStore.BookStore.Service.BookService;
import com.example.bookStore.BookStore.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/books")
    private ResponseEntity<Books> saveBook(@RequestBody Books book){
        return ResponseEntity.ok().body(this.bookService.addBook(book));
    }
}
