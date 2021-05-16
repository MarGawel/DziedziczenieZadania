package pl.coderslab.zadaniedomowe;

public class Main01 {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Harry Potter");
        Book book2 = new Book(2, "Potop");
        Book book3 = new Book(3, "Zemsta");
        User user1 = new User(1, "Marcin", "Gaweł", new Book[] {});

        System.out.println("parametr available: " + book1.getTitle() + " to " + book1.isAvailable());
        System.out.println(user1.getFirstName() + " wypożycza: " + book1.getTitle());
        user1.addBook(book1);
        System.out.println("parametr available: " + book1.getTitle() + " to " + book1.isAvailable());

        user1.showBooks();
        System.out.println(user1.getFirstName() + " wypożycza: " + book2.getTitle());
        user1.addBook(book2);
        System.out.println(user1.getFirstName() + " wypożycza: " + book3.getTitle());
        user1.addBook(book3);
        user1.showBooks();

        System.out.println(user1.getFirstName() + " oddaje " + book2.getTitle());
        user1.returnBook(book2);
        System.out.println("parametr available: " + book2.getTitle() + " to " + book2.isAvailable());
        user1.showBooks();

        System.out.println("oddanie wszystkich książek");
        user1.returnAllBooks();

        user1.showBooks();



    }
}
