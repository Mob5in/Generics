package products;

public class Book extends Product{


    private String author;
    private String publication;
    private String genre;

    public Book(String title, Double price, String author, String publication, String genre) {
        super(title, price);
        this.author = author;
        this.publication = publication;
        this.genre = genre;
    }


    @Override
    public String toString(){
        return super.toString() + ", Author: " + author + ", Publication: " + publication + ", Genre: " + genre;
    }

    @Override
    protected String generateId() {
        return "";
    }
}
