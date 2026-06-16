import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Mobile", "Electronics"),
                new Product(110, "Shoes", "Fashion"),
                new Product(103, "Watch", "Accessories"),
                new Product(108, "Headphones", "Electronics")
        };

        int searchId = 103;

        // Linear Search
        System.out.println("===== Linear Search =====");

        Product linearResult =
                SearchOperations.linearSearch(products, searchId);

        if (linearResult != null) {
            System.out.println("Product Found:");
            System.out.println(linearResult);
        } else {
            System.out.println("Product Not Found");
        }

        // Sort Array for Binary Search
        Arrays.sort(products,
                Comparator.comparingInt(p -> p.productId));

        System.out.println("\n===== Binary Search =====");

        Product binaryResult =
                SearchOperations.binarySearch(products, searchId);

        if (binaryResult != null) {
            System.out.println("Product Found:");
            System.out.println(binaryResult);
        } else {
            System.out.println("Product Not Found");
        }
    }
}