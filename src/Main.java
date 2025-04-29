import products.*;
import inventory.inventory;


public class Main {
    public static double calculateTotalPrice(inventory<? extends Product> inventory){
        double total = 0;
        for (Product item : inventory.getItems()) {
            total += item.getPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        inventory<Book> bookinventory = new inventory<Book>();
        inventory<Notebook> notebookinventory = new inventory<Notebook>();
        inventory<Accessory> accessoryinventory = new inventory<Accessory>();

        bookinventory.addItem(new Book("The gay science", 30.15, "Friedrich Nietzsche", "Mobin", "philosophical"));
        bookinventory.addItem(new Book("1984", 19.99, "George Orwell", "Negar", "Political Novel"));

        notebookinventory.addItem(new Notebook("A4", 12.50, 120, true));
        notebookinventory.addItem(new Notebook("A3", 8.75, 80, false));


        accessoryinventory.addItem(new Accessory("Pen", 45.00, "Black"));
        accessoryinventory.addItem(new Accessory("Bookmark", 5.50, "Gold"));


        System.out.println("Books:");
        bookinventory.displayAll();
        System.out.println("\nNotebooks:");
        notebookinventory.displayAll();
        System.out.println("\nAccessories:");
        accessoryinventory.displayAll();


        bookinventory.removeItemById(1000);
        notebookinventory.removeItemById(2000);

        System.out.println("\nTotal price of books: " + calculateTotalPrice(bookinventory));
        System.out.println("Total price of notebooks: " + calculateTotalPrice(notebookinventory));
        System.out.println("Total price of accessories: " + calculateTotalPrice(accessoryinventory));


        System.out.println("\nSearching for existing product:");
        Product found = bookinventory.findItemById(1001);
        System.out.println(found);

        System.out.println("\nSearching for non-existing product:");
        found = notebookinventory.findItemById(2999);
        if(found == null){
            System.out.println("Not found");
        }else{
            System.out.println(found);
        }


        bookinventory.applyDiscount("1984", 10);
        accessoryinventory.applyDiscount("Pen", 15);

        System.out.println("\nAfter discounts:");
        System.out.println("Books:");
        bookinventory.displayAll();
        System.out.println("\nAccessories:");
        accessoryinventory.displayAll();
    }
}