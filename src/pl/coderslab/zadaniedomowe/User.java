package pl.coderslab.zadaniedomowe;

import java.util.Arrays;

public class User extends Person{
    private Book[] books;
    private Book[] tmp = {};


    public User(int id, String firstName, String lastName, Book[] books) {
        super(id, firstName, lastName);
        this.books = books;
    }

    public void addBook(Book book){
        this.books = Arrays.copyOf(this.books, this.books.length + 1);
        this.books[this.books.length - 1] = book;
        book.setAvailable(false);
        book.borrowBook();
        System.out.println("wypożyczono " + book.getTitle());
    }

    private void addTmpBook(Book book){
        this.tmp = Arrays.copyOf(this.tmp, this.tmp.length + 1);
        this.tmp[this.tmp.length - 1] = book;

    }

    public void showBooks(){
        int i = 1;
        if (this.books.length > 0) {
            System.out.println(this.getFirstName() + " ma wypożyczone: ");
            for (Book b : books) {
                System.out.println("    " + i + ": " + b.getTitle());
                i++;
            }
        } else {
            System.out.println(this.getFirstName() + " nie ma wypożyczonych książek");
        }
    }

    public void returnBook(Book book){
        book.setAvailable(true);

        for (Book b : this.books){
            if (book.equals(b)){
                book.setAvailable(true);
            } else {
                addTmpBook(b); // dodanie to tymczasowej tablicy tego co jest w tablicy books
            }
        }
        books = new Book[0]; // zerowanie tablicy books
        for (Book b : this.tmp){
            addBook(b); // przepisanie do tablic books tego co w tablic tymczasowej
        }

    }

    public void returnAllBooks(){
        for (Book b : this.books){
            b.setAvailable(true);
        }
        books = new Book[0];
    }

}