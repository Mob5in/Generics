package products;

public class Book extends Product{


    private String author;
    private String publication;
    private String genre;


    @Override
    protected String generateId() {
        return "";
    }
}
