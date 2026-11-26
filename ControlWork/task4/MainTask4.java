package ControlWork.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainTask4 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple", 45.0, 5));
        products.add(new Product("Avocado", 120.0, 4));
        products.add(new Product("Banana", 65.0, 2));
        products.add(new Product("Coffee", 250.0, 5));
        products.add(new Product("Bread", 30.0, 2));
        products.add(new Product("Almonds", 180.0, 4));

        Consumer<Product> printProduct = p -> System.out.println(p);

        System.out.println("All products:");
        products.forEach(printProduct);

        Predicate<Product> cheaperThan100 = p -> p.getPrice() < 100;
        System.out.println("\nPrice < 100:");
        filterAndPrint(products, cheaperThan100, printProduct);

        Predicate<Product> ratingBelow3 = p -> p.getRating() < 3;
        System.out.println("\nRating < 3:");
        filterAndPrint(products, ratingBelow3, printProduct);

        Predicate<Product> startsWithA = p -> p.getName().startsWith("A");
        System.out.println("\nStarts with A:");
        filterAndPrint(products, startsWithA, printProduct);

        double sum = 0;
        for (Product p : products) {
            sum += p.getPrice();
        }
        double averagePrice = sum / products.size();

        Predicate<Product> cheaperThanAverage = p -> p.getPrice() < averagePrice;
        System.out.println("\nPrice < average (" + averagePrice + "):");
        filterAndPrint(products, cheaperThanAverage, printProduct);

        Consumer<Product> discount10 = p -> p.setPrice(p.getPrice() * 0.9);
        products.forEach(discount10);

        System.out.println("\nAfter 10% discount:");
        products.forEach(printProduct);
    }

    public static void filterAndPrint(List<Product> list, Predicate<Product> predicate, Consumer<Product> consumer) {
        for (Product p : list) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
