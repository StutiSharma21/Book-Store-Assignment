package com.example.bookStore.BookStore.Controller;

import com.example.bookStore.BookStore.Module.User;
import com.example.bookStore.BookStore.Module.Wallet;
import com.example.bookStore.BookStore.Service.BookInventoryService;
import com.example.bookStore.BookStore.Service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WalletController {

    @Autowired
    private WalletService walletService;

    @PostMapping("/addWallet")
    private ResponseEntity<Wallet> saveWallet(@RequestBody Wallet wallet){
        return ResponseEntity.ok().body(this.walletService.createWallet(wallet));
    }

    @PutMapping("/addMoney/{user_id}/{money}")
    private ResponseEntity<Wallet> addMoney(@PathVariable int user_id, @PathVariable int money){
        return ResponseEntity.ok().body(this.walletService.addMoney(user_id,money));
    }

}
