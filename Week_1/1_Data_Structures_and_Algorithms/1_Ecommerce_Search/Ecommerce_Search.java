import java.util.*;

public class Ecommerce_Search {
    private List<String> products;

    public Ecommerce_Search() {
        products = new ArrayList<>();
        // Add some sample products
        products.add("Red Nike Running Shoes");
        products.add("Blue Adidas Sports Shoes");
        products.add("Samsung Galaxy Mobile");
        products.add("iPhone 14 Pro");
        products.add("HP Laptop");
        products.add("Apple Watch");
    }

    public List<String> search(String keyword) {
        List<String> results = new ArrayList<>();
        keyword = keyword.toLowerCase(); // case-insensitive

        for (String product : products) {
            if (product.toLowerCase().contains(keyword)) {
                results.add(product);
            }
        }

        return results;
    }
}
