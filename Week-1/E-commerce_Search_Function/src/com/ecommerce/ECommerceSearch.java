// File: ECommerceSearch.java
package com.ecommerce;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class ECommerceSearch {

    // Linear Search Implementation
    public static Product linearSearch(List<Product> products, String targetProductName) {
        if (products == null || targetProductName == null) {
            return null;
        }
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(targetProductName)) {
                return product; // Found
            }
        }
        return null; // Not found
    }

    // Binary Search Implementation
    // Assumes the products list is sorted by productName
    public static Product binarySearch(List<Product> sortedProducts, String targetProductName) {
        if (sortedProducts == null || targetProductName == null || sortedProducts.isEmpty()) {
            return null;
        }

        int low = 0;
        int high = sortedProducts.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid potential overflow
            Product midProduct = sortedProducts.get(mid);
            int comparison = midProduct.getProductName().compareToIgnoreCase(targetProductName);

            if (comparison == 0) {
                return midProduct; // Found
            } else if (comparison < 0) {
                low = mid + 1; // Target is in the right half
            } else {
                high = mid - 1; // Target is in the left half
            }
        }
        return null; // Not found
    }

    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("P001", "Laptop", "Electronics"),
                new Product("P002", "Smartphone", "Electronics"),
                new Product("P003", "Coffee Maker", "Appliances"),
                new Product("P004", "Desk Chair", "Furniture"),
                new Product("P005", "Book: Java Programming", "Books"),
                new Product("P006", "Headphones", "Electronics"),
                new Product("P007", "Blender", "Appliances")
        ));

        // --- Linear Search Demonstration ---
        System.out.println("--- Linear Search ---");
        String searchTarget1 = "Coffee Maker";
        Product foundProductLinear = linearSearch(products, searchTarget1);
        if (foundProductLinear != null) {
            System.out.println("Found (Linear): " + foundProductLinear);
        } else {
            System.out.println("Product '" + searchTarget1 + "' not found (Linear).");
        }

        String searchTarget2 = "Tablet";
        foundProductLinear = linearSearch(products, searchTarget2);
        if (foundProductLinear != null) {
            System.out.println("Found (Linear): " + foundProductLinear);
        } else {
            System.out.println("Product '" + searchTarget2 + "' not found (Linear).");
        }
        System.out.println();


        // --- Binary Search Demonstration ---
        // For binary search, the list MUST be sorted.
        // We'll sort by productName as defined in Product.compareTo()
        // It's good practice to create a new sorted list if the original order matters elsewhere
        List<Product> sortedProducts = new ArrayList<>(products);
        Collections.sort(sortedProducts); // Sorts based on Product.compareTo()

        // Alternatively, if you need to sort by a different criterion, use a Comparator:
        // Collections.sort(sortedProducts, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));


        System.out.println("--- Binary Search (Sorted by Product Name) ---");
        System.out.println("Sorted Product List for Binary Search:");
        for(Product p : sortedProducts) {
            System.out.println("  " + p);
        }
        System.out.println();


        String searchTarget3 = "Laptop";
        Product foundProductBinary = binarySearch(sortedProducts, searchTarget3);
        if (foundProductBinary != null) {
            System.out.println("Found (Binary): " + foundProductBinary);
        } else {
            System.out.println("Product '" + searchTarget3 + "' not found (Binary).");
        }

        String searchTarget4 = "Keyboard";
        foundProductBinary = binarySearch(sortedProducts, searchTarget4);
        if (foundProductBinary != null) {
            System.out.println("Found (Binary): " + foundProductBinary);
        } else {
            System.out.println("Product '" + searchTarget4 + "' not found (Binary).");
        }
    }
}
