package com.example.bookStore.BookStore.Repository;

import com.example.bookStore.BookStore.Module.BookReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReviewRepository extends JpaRepository<BookReview,Long> {
}
