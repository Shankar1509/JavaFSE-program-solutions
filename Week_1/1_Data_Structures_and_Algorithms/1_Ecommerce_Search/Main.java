import java.util.*;

public class Main {
    public static void main(String[] args) {

        Ecommerce_Search platform = new Ecommerce_Search();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter keyword to search: ");
        String input = scanner.nextLine();

        List<String> results = platform.search(input);

        if (results.isEmpty()) {
            System.out.println("No products found.");
        } else {
            System.out.println("Search Results:");
            for (String product : results) {
                System.out.println("- " + product);
            }
        }
    }
}
