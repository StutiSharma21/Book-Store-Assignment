package com.example.bookStore.BookStore.Repository;

import com.example.bookStore.BookStore.Module.BookReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookReviewRepository extends JpaRepository<BookReview,Long> {
    @Query(value = "Select * from book_review Order By book_like DESC" , nativeQuery = true)
    List<BookReview> sortByBookLikes();
}
