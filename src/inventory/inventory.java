package inventory;

import products.Product;

import java.util.ArrayList;

public class inventory <T extends Product>{
    private ArrayList<T> items;


    public ArrayList<T> getItems() {
        return items;
    }

    public void applyDiscount(String productName, int discount){

    }

    public void addItem(T product){

    }

    public void removeItemById(int id){

    }

    public T findItemById(int id){

    }

    public void displayAll(){

    }
}
