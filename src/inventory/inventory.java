package inventory;

import products.Product;

import java.util.ArrayList;

public class inventory <T extends Product>{
    private ArrayList<T> items = new ArrayList<>();;



    public ArrayList<T> getItems() {
        return items;
    }

    public void applyDiscount(String productName, int discount){
        for (T item : items) {
            if (item.getTitle().equals(productName)) {
                double newPrice = item.getPrice() - discount;
                item.setPrice(newPrice);
            }
        }
    }

    public void addItem(T product){
        this.items.add(product);
    }

    public void removeItemById(int id){
        String ID = String.valueOf(id);
        this.items.removeIf(item ->(item.getId()).equals(ID));
    }

    public T findItemById(int id){
        for(T item: this.items){
            String ID = String.valueOf(id);
            if (item.getId().equals(ID)) {
                return item;
            }
        }
        System.out.println("Product do not exist");
        return null;
    }

    public void displayAll() {
        for (T item : items) {
            System.out.println(item);
        }
    }

}
