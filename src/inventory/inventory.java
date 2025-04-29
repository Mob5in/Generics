package inventory;

import products.Product;

import java.util.ArrayList;

public class inventory <T extends Product>{
    private ArrayList<T> items = new ArrayList<>();;



    public ArrayList<T> getItems() {
        return items;
    }

    public void applyDiscount(String productName, int discount){

    }

    public void addItem(T product){
        this.items.add(product);
    }

    public void removeItemById(int id){
        String ID = String.valueOf(id);
        this.items.removeIf(item ->(item.getId()).equals(ID));
    }

    public T findItemById(int id){

    }

    public void displayAll(){

    }
}
