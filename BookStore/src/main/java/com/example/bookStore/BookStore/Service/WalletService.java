package com.example.bookStore.BookStore.Service;

import com.example.bookStore.BookStore.Exception.UserException;
import com.example.bookStore.BookStore.Module.User;
import com.example.bookStore.BookStore.Module.Wallet;
import com.example.bookStore.BookStore.Repository.UserRepository;
import com.example.bookStore.BookStore.Repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class WalletService {

    @Autowired
    private WalletRepository walletRepository;

    public Wallet createWallet(Wallet wallet) {
        return walletRepository.save(wallet);
    }

    public Wallet addMoney(int user_id,int money) {
        Optional<Wallet> walletObj=this.walletRepository.findByUserIdEquals(user_id);
        if(walletObj.isPresent()) {
            Wallet userNewMoney = walletObj.get();
            if(money % 500 == 0) {
                userNewMoney.setWallet_amount(userNewMoney.getWallet_amount() + money);
                return this.walletRepository.save(userNewMoney);
            }
            else {
                throw new UserException("Please add money in multiples of 500");
            }
        }
        else{
            throw new UserException("User not found with ID: " + user_id);
        }
    }



}
