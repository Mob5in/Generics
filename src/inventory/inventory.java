package inventory;

import products.Product;

import java.util.ArrayList;

public class inventory <T extends Product>{
    private ArrayList<T> items;


    public ArrayList<T> getItems() {
        return items;
    }



}
