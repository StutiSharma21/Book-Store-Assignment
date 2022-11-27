package com.example.bookStore.BookStore.Controller;

import com.example.bookStore.BookStore.Module.BookReview;
import com.example.bookStore.BookStore.Module.User;
import com.example.bookStore.BookStore.Service.BookReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookReviewController {

    @Autowired
    private BookReviewService bookReviewService;

    @PostMapping("/addReview")
    private ResponseEntity<BookReview> saveReview(@RequestBody BookReview bookReview){
        return ResponseEntity.ok().body(this.bookReviewService.addReview(bookReview));
    }

}
