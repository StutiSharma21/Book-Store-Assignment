package com.example.bookStore.BookStore.Service;

import com.example.bookStore.BookStore.Repository.UserRepository;
import com.example.bookStore.BookStore.Repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class WalletService {

    @Autowired
    private WalletRepository walletRepository;

//    @Override
//    public Wallet addMoney(User user, int money) {
//        Optional<User> userObj=this.userRepository.findById((long) user.getUser_id());
//        if(userObj.isPresent()) {
//            User userNewMoney=userObj.get();
//            if((money!=0) && (money%500==0)) {
//                userNewMoney.setWallet(money+user.getWallet());
//                return this.userRepository.save(userNewMoney);
//            }
//            else {
//                throw new UserException("Please add money in multiples of 500");
//            }
//        }
//        else{
//            throw new UserException("User not found with ID: " + user.getUser_id());
//        }
//    }
//


}
