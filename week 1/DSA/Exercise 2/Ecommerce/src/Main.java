import java.util.Arrays;
import java.util.Comparator;

class Product {
    public String productId;
    public String productName;
    public String category;

    public Product(String productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

class Search {

    public static int linearSearch(Product[] products, String targetName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equals(targetName)) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(Product[] products, String targetName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].productName.compareTo(targetName);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void sortProductsByName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName));
    }
}

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("1", "cookie", "food"),
            new Product("2", "cola", "drinks"),
            new Product("3", "football", "Sport"),
            new Product("4", "guiter", "Instruments")
        };
        int index = Search.linearSearch(products, "football");
        System.out.println("Linear Search: Product B found at index " + index);

        Search.sortProductsByName(products);

        index = Search.binarySearch(products, "Product B");
        System.out.println("Binary Search: Product B found at index " + index);
    }
}
