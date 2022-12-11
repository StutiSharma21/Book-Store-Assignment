package com.example.bookStore.BookStore.Service;

import com.example.bookStore.BookStore.Module.*;
import com.example.bookStore.BookStore.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UserTransactionService {

    @Autowired
    private BookInventoryRepository bookInventoryRepository;
    @Autowired
    private UserTransactionRepository userTransactionRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private WalletRepository walletRepository;

    @Autowired
    private UserRepository userRepository;

    public UserTransaction rentBook(UserTransaction userTransaction, long user_id, long book_id, BookInventory bookInventory, Books books, Wallet wallet, User user) {
        Optional<BookInventory> bookInvObj = this.bookInventoryRepository.findByBookCode(bookInventory.getBookCode());
        Optional<Books> booksObj = this.bookRepository.findById(books.getBookId());
        Optional<Wallet> walletObj = this.walletRepository.findById(wallet.getWallet_id());
        Optional<User> userObj = this.userRepository.findById(user.getUser_id());

//        if(bookInvObj.isPresent() && userObj.isPresent()) {

        return userTransaction;
    }
}
