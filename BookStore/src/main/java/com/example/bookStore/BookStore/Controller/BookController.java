package com.example.bookStore.BookStore.Controller;

import com.example.bookStore.BookStore.Module.Books;
import com.example.bookStore.BookStore.Module.User;
import com.example.bookStore.BookStore.Service.BookService;
import com.example.bookStore.BookStore.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/allbooks")
    private ResponseEntity<List<Books>> getAllUsers(){
        return ResponseEntity.ok().body(this.bookService.getBooks());

    }
    @PostMapping("/books")
    private ResponseEntity<Books> saveBook(@RequestBody Books book){
        return ResponseEntity.ok().body(this.bookService.addBook(book));
    }


}
