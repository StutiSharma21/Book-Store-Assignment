package com.example.bookStore.BookStore.Repository;

import com.example.bookStore.BookStore.Module.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet,Long> {
}
