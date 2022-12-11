package com.example.bookStore.BookStore.Module;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Wallet")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int wallet_id;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "wallet_amount")
    private int wallet_amount;

    @CreationTimestamp
    @Column(name = "transactionTime")
    private Date transactionTime;

    public int getWallet_id() {
        return wallet_id;
    }

    public void setWallet_id(int wallet_id) {
        this.wallet_id = wallet_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getWallet_amount() {
        return wallet_amount;
    }

    public void setWallet_amount(int wallet_amount) {
        this.wallet_amount = wallet_amount;
    }

    public Date getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Date transactionTime) {
        this.transactionTime = transactionTime;
    }
}
