package com.example.bookStore.BookStore.Module;

import javax.persistence.*;

@Entity
@Table(name = "BookReview")
public class BookReview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int review_id;

    @Column(name = "user_id")
    private long user_id;

    @Column(name = "book_code")
    private String book_code;

    @Column(name = "book_name")
    private String book_name;

    @Column(name = "book_like")
    private int book_like;

    @Column(name = "book_review")
    private String book_review;

    public int getReview_id() {
        return review_id;
    }

    public void setReview_id(int review_id) {
        this.review_id = review_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getBook_code() {
        return book_code;
    }

    public void setBook_code(String book_code) {
        this.book_code = book_code;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getBook_like() {
        return book_like;
    }

    public void setBook_like(int book_like) {
        this.book_like = book_like;
    }

    public String getBook_review() {
        return book_review;
    }

    public void setBook_review(String book_review) {
        this.book_review = book_review;
    }
}
