package com.example.bookStore.BookStore.Service;

import com.example.bookStore.BookStore.Module.BookInventory;
import com.example.bookStore.BookStore.Module.Books;

import java.util.List;


public interface BookInventoryService {

    List<BookInventory> getBookInventory();

    BookInventory createInv(BookInventory bookInventory);

}
