import java.util.*;
import java.io.*;

public class Datasetreader {
    String filePath;

    public Datasetreader(String filePath) {
        this.filePath = filePath;
    }

    public List<Book> ReadData() {
        String line = "";
        String splitBy = ",";
        Set<String> seenBooks = new HashSet<>();
        List<Book> books = new ArrayList<>();
        try {
            // parsing a CSV file into BufferedReader class constructor
            FileReader fileReader = new FileReader(new File(this.filePath));
            BufferedReader br = new BufferedReader(fileReader);
            boolean isHeader = true;
            while ((line = br.readLine()) != null)
            // returns a Boolean value
            {
                String[] book = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                for (int i = 0; i < book.length; i++) {
                    book[i] = book[i].replaceAll("^\"|\"$", "").trim();
                }

                if (isHeader) {
                    isHeader = false;
                    continue;
                }
                if (book.length >= 7) {
                    String title = book[0];
                    String author = book[1];
                    double userRating = Double.parseDouble(book[2]);
                    int reviews = Integer.parseInt(book[3]);
                    int price = Integer.parseInt(book[4]);
                    int year = Integer.parseInt(book[5]);
                    String genre = book[6];
                    if (!seenBooks.contains(title)) {
                        seenBooks.add(title);
                        books.add(new Book(title, author, userRating, reviews, price, year, genre));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }
}
