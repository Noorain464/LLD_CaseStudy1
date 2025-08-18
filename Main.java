import java.util.List;

public class Main {
    public static void main(String[] args) {
        Datasetreader reader = new Datasetreader("/Users/syedanoorain/Desktop/Books/bestsellers with categories.csv");
        List<Book> books = reader.ReadData();
        Queries queries = new Queries(books);
        queries.totalBooksByAuthor("J.K. Rowling");
        queries.allAuthors();
        queries.bookByAuthor("J.K. Rowling");
        queries.booksbyrating(4.5);
        queries.booksandprice("J.K. Rowling");

    }
}
