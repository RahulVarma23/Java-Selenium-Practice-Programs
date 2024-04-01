package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Transaction {

    String productId;
    String category;
    int amount;

    public String getCategory() {
        return category;
    }

    public int getAmount() {
        return amount;
    }

    Transaction (String productId, String category, int amount) {
        this.productId = productId;
        this.category = category;
        this.amount = amount;
    }

    public static void main(String[] args) {
        List<Transaction> list = Arrays.asList(
                new Transaction("p1", "books", 1000),
                new Transaction("p2", "electronics", 2000),
                new Transaction("p3", "books", 1000),
                new Transaction("p4", "electronics", 4000),
                new Transaction("p5", "toys", 6000),
              new Transaction("p6", "toys", 4000)

        );

        Map<String, Integer> totalSalesByCategory = list.stream()
                .collect(Collectors.groupingBy(Transaction::getCategory,Collectors.summingInt(Transaction::getAmount)));

        System.out.println("Total sales by category: "+totalSalesByCategory);
    }
}
