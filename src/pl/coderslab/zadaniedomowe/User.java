package pl.coderslab.zadaniedomowe;

import java.util.Arrays;

public class User extends Person{
    private Book[] books;


    public User(int id, String firstName, String lastName, Book[] books) {
        super(id, firstName, lastName);
        this.books = books;
    }

    public void addBook(Book book){
        this.books = Arrays.copyOf(this.books, this.books.length + 1);
        this.books[this.books.length - 1] = book;
    }

}