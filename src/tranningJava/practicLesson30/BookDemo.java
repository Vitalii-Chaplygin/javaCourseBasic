package tranningJava.practicLesson30;

import java.util.Set;
import java.util.TreeSet;

public class BookDemo {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();
        books.add(new Book("Hobbit",1));
        books.add(new Book("Cat",2));
        books.add(new Book("Tree",3));
        books.add(new Book("Famali",4));
        System.out.println(books);
    }
}
