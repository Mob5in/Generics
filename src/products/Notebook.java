package products;

public class Notebook extends Product{

    private int pageCount;
    private boolean isHardCover;


    public Notebook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
    }

    @Override
    protected String generateId() {
        return "";
    }
}
