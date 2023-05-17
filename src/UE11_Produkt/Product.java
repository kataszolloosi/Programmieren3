package UE11_Produkt;

public class Product {
    //Schreiben Sie eine Klasse Product zur Abbildung von Produkten mit folgenden Attributen
    private String productName;
    private double price;
    private String productCategory;

    public Product(String productName, double price, String productCategory) {
        this.productName = productName;
        this.price = price;
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product: " +
                productName + " " +
                price + "€ " +
                productCategory;
    }
}
