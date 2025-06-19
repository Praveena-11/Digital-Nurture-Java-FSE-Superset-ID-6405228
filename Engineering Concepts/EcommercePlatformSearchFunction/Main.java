package EcommercePlatformSearchFunction;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
        public static void main(String[] args) {
            Product[] products = {
                    new Product(101, "Shoes", "Footwear"),
                    new Product(102, "T-Shirt", "Apparel"),
                    new Product(103, "Laptop", "Electronics"),
                    new Product(104, "Phone", "Electronics")
            };

            // Linear search (unsorted)
            Product found1 = Searchfunctions.linearSearch(products, "Laptop");
            System.out.println("Linear Search: " + (found1 != null ? found1 : "Not Found"));

            // Sort array by productName before binary search
            Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

            // Binary search (sorted)
            Product found2 = Searchfunctions.binarySearch(products, "Laptop");
            System.out.println("Binary Search: " + (found2 != null ? found2 : "Not Found"));
        }
    }


