package UE11_Produkt;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("UE11 starting up.... \n");


        String path = "C:\\Users\\s53036\\Desktop\\Kata\\Prog3\\produkte.txt";

        ProductManager productManager = new ProductManager();
        Product p1 = new Product("Milch", 3.75, "Milchprodukte");
        Product p2 = new Product("Kaese", 4.56, "Milchprodukte");
        Product p3 = new Product("Brot", 2.45, "Backware");

        productManager.add(p1);
        productManager.add(p2);
        productManager.add(p3);

        productManager.saveToFile(path);
        productManager.readFromFile(path);
    }
}
