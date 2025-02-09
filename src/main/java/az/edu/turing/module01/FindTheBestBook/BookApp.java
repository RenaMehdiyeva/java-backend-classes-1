package az.edu.turing.module01.FindTheBestBook;

import java.util.*;
import java.util.stream.Collectors;

public class BookApp {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("1984", "George Orwell", "Fiction", 8.99, 4.9),
                new Book("Dune", "Frank Herbert", "Sci-Fi", 12.50, 4.8),
                new Book("Sapiens", "Yuval Noah Harari", "Non-Fiction", 15.00, 4.7),
                new Book("The Hobbit", "J.R.R. Tolkien", "Fiction", 9.50, 4.8),
                new Book("Brave New World", "Aldous Huxley", "Fiction", 11.99, 4.6)
        );

        List<Book> affordableBooks = books.stream()
                .filter(book -> book.getPrice() <= 10.00)
                .collect(Collectors.toList());
        System.out.println("Cheap books:");
        affordableBooks.forEach(System.out::println);

        List<Book> sortedBooks = books.stream()
                .sorted(Comparator.comparingDouble(Book::getPrice))
                .collect(Collectors.toList());
        System.out.println("\nBooks sorted by price:");
        sortedBooks.forEach(System.out::println);

        Optional<Book> bestRatedBook = books.stream()
                .max(Comparator.comparingDouble(Book::getRating));
        bestRatedBook.ifPresent(book -> System.out.println("\nTop rated book:\n" + book));

        Map<String, List<Book>> booksByGenre = books.stream()
                .collect(Collectors.groupingBy(Book::getGenre));
        System.out.println("\nGrouping of books by genre:");
        booksByGenre.forEach((genre, bookList) -> {
            System.out.println("\n" + genre + ":");
            bookList.forEach(System.out::println);
        });
    }
}
