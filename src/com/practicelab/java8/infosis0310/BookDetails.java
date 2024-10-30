package com.practicelab.java8.infosis0310;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookDetails {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(new Book("book1", 4.5, "Great book!"),
                new Book("book1", 3.8, "Good read."),
                new Book("book2", 2.5, "Not my Favourite"),
                new Book("book2", 3.0, "It was Okay"),
                new Book("book3", 5.0, "Excellent!"),
                new Book("book3", 4.8, "Amazing read"),
                new Book("book3", 4.2, "Very informative"));
        averageAgeOfEachBookAndCountNumberOfReviews(bookList);


        /*Given list of Book Objects with fields like(bookId,rating,comment),calculate the average rating for each book and
        count the number of reviews.filter out reviews with ratings below a certain threshhold -3.0*/
    }
    private static void averageAgeOfEachBookAndCountNumberOfReviews(List<Book> bookList){
        Map<String, List<Book>> booksReviewsMap = bookList.stream().filter(book -> book.getRating() >= 3.0)
                .collect(Collectors.groupingBy(Book::getBookId));
        booksReviewsMap.forEach((bookId,reviewList)->{
            double averageRating = reviewList.stream().mapToDouble(Book::getRating).average().orElse(0.0);
            long count = reviewList.size();
            System.out.println("Book Id: "+bookId+",Average Rating: "+averageRating+",Review count: "+count);
        });

    }
}
