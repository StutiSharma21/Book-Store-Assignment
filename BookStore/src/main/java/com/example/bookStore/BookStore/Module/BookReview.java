package com.example.bookStore.BookStore.Module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BookInventory")
public class BookReview {

    @Column(name = "bookCode")
    private String bookCode;

    @Column(name = "bookName")
    private String bookName;

    @Column(name = "bookLike")
    private int bookLike;

    @Column(name = "bookReview")
    private String bookReview;

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

    public int getBookLike() {
        return bookLike;
    }

    public void setBookLike(int bookLike) {
        this.bookLike = bookLike;
    }

    public String getBookReview() {
        return bookReview;
    }

    public void setBookReview(String bookReview) {
        this.bookReview = bookReview;
    }
}
