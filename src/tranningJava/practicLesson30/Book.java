package tranningJava.practicLesson30;

import java.util.Objects;

public class Book implements  Comparable<Book> {
  private   String nameBook;
   private Integer idBook;

    public Book(String nameBook, Integer idBook) {
        this.nameBook = nameBook;
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Integer getIdBook() {
        return idBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", idBook=" + idBook +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameBook, book.nameBook) && Objects.equals(idBook, book.idBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, idBook);
    }

    @Override
    public int compareTo(Book bookMethod) {
        int compareResult =  idBook-bookMethod.idBook;
        if (compareResult==0){
             compareResult = nameBook.compareTo(bookMethod.getNameBook());
        }

        return compareResult ;
    }
}
