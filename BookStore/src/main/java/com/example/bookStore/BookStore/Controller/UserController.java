package com.example.bookStore.BookStore.Controller;

import com.example.bookStore.BookStore.Module.BookReview;
import com.example.bookStore.BookStore.Module.Books;
import com.example.bookStore.BookStore.Module.User;
import com.example.bookStore.BookStore.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    private ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok().body(this.userService.getUser());

    }

    @PostMapping("/user")
    private ResponseEntity<User> saveUser(@RequestBody User user){
        return ResponseEntity.ok().body(this.userService.createUser(user));
    }

    @PutMapping("/update_user/{user_id}")
    private ResponseEntity<User> updateUser(@PathVariable long user_id, @RequestBody User user){
        user.setUser_id((user_id));
        return ResponseEntity.ok().body(this.userService.updateUser(user));
    }

    @PutMapping("/suspend_user/{user_id}")
    private ResponseEntity<User> suspendUser(@PathVariable long user_id, @RequestBody User user){
        user.setUser_id((user_id));
        return ResponseEntity.ok().body(this.userService.suspendUser(user));
    }

    @GetMapping("/availablebooks")
    private ResponseEntity<List<Books>> booksAvailable(){
        return ResponseEntity.ok().body(this.userService.availableBooks());
    }


}
