package products;

public class Accessory extends Product{

    private static int counter = 0;
    private String color;

    public Accessory(String title, Double price, String color) {
        super(title, price);
        counter ++;
        this.color = color;
        setId(generateId());
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


    @Override
    protected String generateId() {
        int count = counter;
        return "31" + String.format("%02d", count);
    }

}
