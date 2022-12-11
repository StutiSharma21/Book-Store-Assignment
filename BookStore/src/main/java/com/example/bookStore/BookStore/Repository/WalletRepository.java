package com.example.bookStore.BookStore.Repository;

import com.example.bookStore.BookStore.Module.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface WalletRepository extends JpaRepository<Wallet,Integer> {
    @Query(value = "select * from Wallet where user_id = ?1" , nativeQuery = true)
    Optional<Wallet> findByUserIdEquals(int user_id);
}
