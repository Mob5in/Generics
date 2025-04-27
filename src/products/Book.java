package products;

public class Book extends Product{


    private String author;
    private String publication;
    private String genre;


    public String toString(){
        return super.toString() + ", Author: " + author + ", Publication: " + publication + ", Genre: " + genre;
    }

    @Override
    protected String generateId() {
        return "";
    }
}
