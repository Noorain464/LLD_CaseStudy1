public class Book {
    String title;
    String author;
    double userRating;
    int reviews;
    int price;
    int year;
    String genre;
    public Book(String title, String author, double userRating, int reviews, int price, int year, String genre) {
        this.title = title;
        this.author = author;
        this.userRating = userRating;
        this.reviews = reviews;
        this.price = price;
        this.year = year;
        this.genre = genre;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getUserRating() {
        return userRating;
    }
    public int getReviews() {
        return reviews;
    }
    public int getPrice() {
        return price;   
    }
    public int getYear() {
        return year;
    }
    public String getGenre() {
        return genre;
    }
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("User Rating: " + userRating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Price: $" + price);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
    }         

}