package com.practicelab.java8.infosis0310;

public class Book {

    private String bookId;
    private Double rating;
    private String comment;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Book(String bookId, Double rating, String comment) {
        this.bookId = bookId;
        this.rating = rating;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }
}
