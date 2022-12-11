package com.example.bookStore.BookStore.Repository;

import com.example.bookStore.BookStore.Module.BookInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Optional;

public interface BookInventoryRepository extends JpaRepository<BookInventory,Long> {
    @Query(value = "select * from book_inventory where book_code = ?1" , nativeQuery = true)
    Optional<BookInventory> findByBookCode(String bookCode);

    @Modifying
    @Query(value = "insert into book_inventory(book_code,book_name,no_of_copies) VALUES (?1,?2,?3)", nativeQuery = true)
    @Transactional
    void addBookInInventory(String bookCode, String bookName,int quantity);

    @Modifying
    @Query("update BookInventory b set b.noOfCopies = b.noOfCopies + 1 where b.bookCode=?1")
    void updateBookQuantityInInventory(String bookCode);

}
