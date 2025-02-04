package opgave02.controller;


import opgave02.models.*;

public class Bookstore {
    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.addItem(new Book(BookType.BOOK,600, "Introduction to Java Programming and Data Structures"));
        basket.addItem(new Book(BookType.BOOK,350, "Head First Design Patterns"));
        basket.addItem(new Book(BookType.EBOOK, 125, "HTML & CSS"));

        basket.addDiscount(new PercentDiscount("10% rabat på alt", -10));
        basket.addDiscount(new FixedDiscount("25 kr rabat på beløb over 500 kr.", -25, 500));
        basket.addDiscount(new FixedDiscount("50 kr rabat på beløb over 1000 kr.", -50, 1000));

        basket.addDiscount(new TwoForOneDiscount("2-for-1 book discount"));



        basket.printTotal();
    }
}