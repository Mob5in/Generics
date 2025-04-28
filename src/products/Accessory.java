package products;

public class Accessory extends Product{


    public Accessory(String title, Double price) {
        super(title, price);
    }

    @Override
    protected String generateId() {
        return "";
    }
}
