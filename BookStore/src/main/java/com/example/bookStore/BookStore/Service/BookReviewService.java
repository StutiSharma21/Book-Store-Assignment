package com.example.bookStore.BookStore.Service;

import com.example.bookStore.BookStore.Module.BookReview;

import java.util.List;

public interface BookReviewService {
    BookReview addReview(BookReview bookReview);

    List<BookReview> sortBooks();
}
