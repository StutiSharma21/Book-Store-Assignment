package com.example.bookStore.BookStore.Module;

import jdk.jfr.Timestamp;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BookInventory")
public class BookInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int inventory_id;

    @Column(name = "bookCode")
    private String bookCode;

    @Column(name = "bookName")
    private String bookName;

    @Column(name = "noOfCopies")
    private int noOfCopies;

    @CreationTimestamp
    @Column(name = "bookCreated")
    private Date bookCreated;

    public int getInventory_id() {
        return inventory_id;
    }

    public void setInventory_id(int inventory_id) {
        this.inventory_id = inventory_id;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public Date getBookCreated() {
        return bookCreated;
    }

    public void setBookCreated(Date bookCreated) {
        this.bookCreated = bookCreated;
    }
}
