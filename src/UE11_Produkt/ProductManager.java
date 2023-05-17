package UE11_Produkt;

import java.io.*;
import java.util.ArrayList;

public class ProductManager {
    //Schreiben Sie eine Klasse ProductManager zum Verwalten von Produkten in einer privaten Liste
    private ArrayList<Product> products = new ArrayList<>();

    //fügt ein Produkt hinzu
    public void add (Product p) {
        products.add(p);
    }

    //speichert die Produkte in der übergebenen Datei - Realisieren Sie dies mittels BufferedWriter und Filewriter
    public void saveToFile(String path) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Product p : products) {
            bufferedWriter.write(p.toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    //laden Sie den Text von der übergebenen Datei und geben Sie den Text auf der Konsole aus
    public void readFromFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String zeile;
        while ((zeile = bufferedReader.readLine()) != null) {
            System.out.println(zeile);
        }
    }

    @Override
    public String toString() {
        return "ProductManager: " +
                "products=" + products;
    }
}
