package pl.coderslab.zadaniedomowe;

public class Main01 {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Harry Poter");
        Book book2 = new Book(2, "Potop");

        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book1));

        System.out.println(book1.getPopularity());
        book1.borrowBook();
        System.out.println(book1.getPopularity());

    }
}
