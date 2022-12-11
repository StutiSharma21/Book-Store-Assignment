package com.example.bookStore.BookStore.Repository;

import com.example.bookStore.BookStore.Module.BookReview;
import com.example.bookStore.BookStore.Module.Books;
import com.example.bookStore.BookStore.Module.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long>{

    @Query(value = "Select * from books where is_available=?1" , nativeQuery = true)
    List<Books> availableBooks(int isAvailable);
}

