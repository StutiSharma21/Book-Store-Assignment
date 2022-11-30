package com.example.bookStore.BookStore.Repository;

import com.example.bookStore.BookStore.Module.UserTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTransactionRepository extends JpaRepository<UserTransaction,Long> {
}
