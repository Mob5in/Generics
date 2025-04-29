package products;

public class Notebook extends Product{

    private int pageCount;
    private boolean isHardCover;
    private static int counter = 0;

    public Notebook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
        counter ++;
        setId(generateId());
    }


    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return super.toString() + ", Page Count: " + pageCount + ", Hard Cover: " + isHardCover;
    }

    @Override
    protected String generateId() {
        int count = counter;
        return "2" + String.format("%03d", count);
    }
}
