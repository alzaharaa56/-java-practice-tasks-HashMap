import java.util.HashMap;

public class ProductPriceDemos {
    public static void main(String[] args) {

        HashMap<String, Double> productPrices = new HashMap<>();

        productPrices.put("Laptop", 450.0);
        productPrices.put("Smartphone", 299.9);
        productPrices.put("Headphones", 45.0);
        productPrices.put("Monitor", 120.5);
        productPrices.put("Keyboard", 25.0);

        System.out.println("Initial Product Prices: " + productPrices);

        System.out.println("Price of Laptop: " + productPrices.get("Laptop"));

        System.out.println("Does 'Smartphone' exist? " + productPrices.containsKey("Smartphone"));

        productPrices.put("Monitor", 115.0);
        System.out.println("Updated Product List: " + productPrices);

        productPrices.remove("Keyboard");
        System.out.println("After removing Keyboard: " + productPrices);

        System.out.println("Total products in stock: " + productPrices.size());
    }
}
