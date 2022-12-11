package com.example.bookStore.BookStore.Controller;

import com.example.bookStore.BookStore.Module.*;
import com.example.bookStore.BookStore.Repository.BookInventoryRepository;
import com.example.bookStore.BookStore.Repository.BookRepository;
import com.example.bookStore.BookStore.Repository.UserRepository;
import com.example.bookStore.BookStore.Repository.WalletRepository;
import com.example.bookStore.BookStore.Service.BookInventoryService;
import com.example.bookStore.BookStore.Service.BookReviewService;
import com.example.bookStore.BookStore.Service.UserTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserTransactionController {

    @Autowired
    private UserTransactionService userTransactionService;


    @PostMapping("/rentBook/{user_id}/{book_id}")
    private ResponseEntity<UserTransaction> rentBook(@RequestBody UserTransaction userTransaction, @PathVariable long user_id, @PathVariable long book_id, BookInventory bookInventory, Books books, Wallet wallet,User user){
        return ResponseEntity.ok().body(this.userTransactionService.rentBook(userTransaction, user_id, book_id, bookInventory,books,wallet,user));


    }
}
