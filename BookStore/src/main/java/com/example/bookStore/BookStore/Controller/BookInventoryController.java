package com.example.bookStore.BookStore.Controller;

import com.example.bookStore.BookStore.Module.BookInventory;
import com.example.bookStore.BookStore.Module.BookReview;
import com.example.bookStore.BookStore.Module.User;
import com.example.bookStore.BookStore.Service.BookInventoryService;
import com.example.bookStore.BookStore.Service.BookReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookInventoryController {

    @Autowired
    private BookInventoryService bookInventoryService;

    @GetMapping("/bookInventory")
    private ResponseEntity<List<BookInventory>> getAllBooks(){
        return ResponseEntity.ok().body(this.bookInventoryService.getBookInventory());

    }

    @PostMapping("/addInv")
    private ResponseEntity<BookInventory> saveInv(@RequestBody BookInventory bookInventory){
        return ResponseEntity.ok().body(this.bookInventoryService.createInv(bookInventory));
    }

}
