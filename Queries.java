import java.util.*;

public class Queries {
    List<Book> books;
    public Queries(List<Book> books) {
        this.books = books;
    }
    public void totalBooksByAuthor(String author){
        int count = 0;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                count++;
            }
        }
        System.out.println("Total books by " + author + ": " + count);
    }
    public void allAuthors(){
        Set<String> authors = new HashSet<>();
        for (Book book : books) {
            authors.add(book.getAuthor());
        }
        System.out.println("All authors: " + authors);
    }
    public void bookByAuthor(String author){
        Set<String> titles = new HashSet<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                titles.add(book.getTitle());
            }
        }
        System.out.println("Books by " + author + ": " + titles);
    }
    public void booksbyrating(double rating){
        List<Book> ratedBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getUserRating() == rating) {
                ratedBooks.add(book);
            }
        }
        System.out.println("Books with rating = " + rating + ":");
        for (Book book : ratedBooks) {
            book.printDetails();
        }
    }
    public void booksandprice(String author){
        List<Book> authorBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                authorBooks.add(book);
            }
        }
        System.out.println("Books by " + author + " with their prices:");
        for (Book book : authorBooks) {
            System.out.println(book.getTitle() + " - $" + book.getPrice());
        }
    }
}
