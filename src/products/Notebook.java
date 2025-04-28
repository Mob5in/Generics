package products;

public class Notebook extends Product{

    private int pageCount;
    private boolean isHardCover;


    public Notebook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
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
        return "";
    }
}
