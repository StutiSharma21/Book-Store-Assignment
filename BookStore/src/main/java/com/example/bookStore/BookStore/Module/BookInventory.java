package com.example.bookStore.BookStore.Module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "BookInventory")
public class BookInventory {

    @Column(name = "bookCode")
    private String bookCode;

    @Column(name = "bookName")
    private String bookName;

    @Column(name = "noOfCopies")
    private int noOfCopies;

    @Column(name = "bookCreated")
    private Date bookCreated;

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
