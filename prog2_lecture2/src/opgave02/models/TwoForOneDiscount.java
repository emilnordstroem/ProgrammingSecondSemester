package opgave02.models;

import java.util.ArrayList;

public class TwoForOneDiscount extends Discount{
    public TwoForOneDiscount(String description) {
        super(description);
    }

    @Override
    public double applyDiscount(double amount){
        return 0;
    }

    public double applyDiscount(ArrayList<Book> books) {
        if(books.size() >= 2){
            double cheapestBookPrice = books.getFirst().getPrice();
            for(Book book : books){
                if(book.getPrice() < cheapestBookPrice){
                    cheapestBookPrice = book.getPrice();
                }
            }
            return -cheapestBookPrice;
        }
        return 0;
    }
}