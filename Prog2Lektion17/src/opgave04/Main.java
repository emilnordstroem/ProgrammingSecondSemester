package opgave04;

import opgave04.models.Book;
import opgave04.models.Buyer;
import opgave04.models.Customer;
import opgave04.models.Salesman;

public class Main {
    public static void main(String[] args) {
        Salesman madsTheSalesMan = new Salesman("Mads");
        Buyer susanTheBuyer = new Buyer("Susan");

        Book donaldDuck = new Book("Donald Duck");
        donaldDuck.registerObserver(madsTheSalesMan);
        donaldDuck.registerObserver(susanTheBuyer);

        susanTheBuyer.buyBook(donaldDuck, 6);
        System.out.println();

        Book java = new Book("Java");
        java.registerObserver(madsTheSalesMan);
        java.registerObserver(susanTheBuyer);

        susanTheBuyer.buyBook(java, 8);
        System.out.println();

        Book designPatterns = new Book("Design Patterns");
        designPatterns.registerObserver(madsTheSalesMan);
        designPatterns.registerObserver(susanTheBuyer);

        susanTheBuyer.buyBook(designPatterns, 10);
        System.out.println();

        Customer bob = new Customer("Bob");
        Customer alice = new Customer("Alice");
        Customer harry = new Customer("Harry");

        //---------------------------------------------------------------------

        makeSale(donaldDuck, bob);
        System.out.println();
        makeSale(donaldDuck, alice);
        System.out.println();
        makeSale(donaldDuck, harry);
        System.out.println();

        makeSale(java, bob);
        System.out.println();
        makeSale(java, alice);
        System.out.println();
        makeSale(java, harry);
        System.out.println();

        makeSale(designPatterns, bob);
        System.out.println();

        // TODO: print each customer and his/her books
    }

    public static void makeSale(Book book, Customer customer) {
        System.out.println("Sale: " + book + " sold to " + customer.getName());
        book.addBougtBy(customer);
        book.decCount(1);
        customer.addBoughtBooks(book);
    }

}
