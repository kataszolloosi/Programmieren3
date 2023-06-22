package UE11_Produkt;

import java.io.*;
import java.util.ArrayList;

public class ProductManager {
    //Schreiben Sie eine Klasse ProductManager zum Verwalten von Produkten in einer privaten Liste
    private ArrayList<Product> products = new ArrayList<>();

    //fügt ein Produkt hinzu
    public void add(Product p) {
        products.add(p);
    }

    //speichert die Produkte in der übergebenen Datei - Realisieren Sie dies mittels BufferedWriter und Filewriter
    public void saveToFile(String path) {
        File file = new File(path);


        for (Product p : products) {
            try {
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(p.toString());
                bufferedWriter.newLine();
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //laden Sie den Text von der übergebenen Datei und geben Sie den Text auf der Konsole aus
    public void readFromFile(String path) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String zeile;
        while (true) {
            try {
                if (!((zeile = bufferedReader.readLine()) != null)) break;
                System.out.println(zeile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String toString() {
        return "ProductManager: " +
                "products=" + products;
    }
}
