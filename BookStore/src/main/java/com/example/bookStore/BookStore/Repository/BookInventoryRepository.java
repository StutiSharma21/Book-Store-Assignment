package com.example.bookStore.BookStore.Repository;

import com.example.bookStore.BookStore.Module.BookInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookInventoryRepository extends JpaRepository<BookInventory,Long> {
}
