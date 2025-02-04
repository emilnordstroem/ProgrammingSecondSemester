package opgave02.models;

import java.util.ArrayList;

public class Basket {
    private final ArrayList<Book> items = new ArrayList<>();
    private final ArrayList<Discount> discounts = new ArrayList<>();
    private double total = 0;

    public void addItem(Book item) {
        total += item.getPrice();
        items.add(item);
    }

    public void addDiscount(Discount discount) {
        discounts.add(discount);
    }

    public void printTotal() {
        double totalDiscount = 0;
        for (Book book : items) {
            System.out.printf("%-60s %6.2f kr.%n", book.getTitle(), book.getPrice());
        }
        System.out.println("-------------------------------------------------------------------------");
        for (Discount discount : discounts) {
            if(discount instanceof TwoForOneDiscount){
                TwoForOneDiscount twoForOneDiscount = (TwoForOneDiscount) discount; // Explicit casting
                double discountAmount = twoForOneDiscount.applyDiscount(items);
                System.out.printf("%-60s %6.2f kr.%n", discount.getDescription(), discountAmount);
                totalDiscount += discountAmount;
            } else {
                double discountAmount = discount.applyDiscount(total);
                System.out.printf("%-60s %6.2f kr.%n", discount.getDescription(), discountAmount);
                totalDiscount += discountAmount;
            }
        }
        double discountedTotal = total + totalDiscount;
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("%-60s %5.2f kr.%n", "i alt: ", discountedTotal);
    }
}