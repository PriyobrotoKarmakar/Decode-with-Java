import java.util.Scanner;
class Product {
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    
    public String toString() {
        return "Product Name: " + name + ", Price: Rs. " + price;
    }

   
    public boolean equals(Product obj) {
        return (this.price == obj.price);
    }
}

class PriceComparator {
    public static int compare(Product p1, Product p2) {
        return (p1.getPrice()>p2.getPrice())?-1:0;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());  // Ensuring no extra space is included in input
        
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ", 2);
            String name = input[0];
            double price = Double.parseDouble(input[1]);
            products[i] = new Product(name, price);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (PriceComparator.compare(products[j], products[j + 1]) < 0) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }

        for (Product product : products) {
            System.out.println(product);
        }

        scanner.close();
    }
}

public class q5 {
    
}
