package products;

public class Accessory extends Product{

    private String color;

    public Accessory(String title, Double price) {
        super(title, price);
    }

    @Override
    protected String generateId() {
        return "";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "_ Color: " + color;
    }


}
