package com.example.bookStore.BookStore.Service;

import com.example.bookStore.BookStore.Module.BookReview;
import com.example.bookStore.BookStore.Module.Books;
import com.example.bookStore.BookStore.Module.User;

import java.util.List;


public interface UserService {

    User createUser(User user);
    User updateUser(User user);
    User suspendUser(User user);
    List<User> getUser();
    List<Books> availableBooks();
//    User addMoney(User user,int money);
}
