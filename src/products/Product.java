package products;

public abstract class Product {

    private String title;
    private double price;
    private String id;


    public Product(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public String toString(){
        return id + "-" + title + ": " + price;
    }

    protected abstract String generateId();

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

}
