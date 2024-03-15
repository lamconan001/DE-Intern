package Products;

public class Book extends Product {
    private String author;
    private String genre;

    public Book(String name, double price, String author, String genre) {
        super(name, price);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + super.getName() + "\nCost: " + super.getPrice() + "\nAuthor: " + author + "\nGenre: " + genre);
    }
}
