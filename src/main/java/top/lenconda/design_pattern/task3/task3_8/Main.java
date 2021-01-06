package top.lenconda.design_pattern.task3.task3_8;

public class Main {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        buyer.setBook(new ComputerBook());
        System.out.println("Bought a computer book, original price is 90 while discounted is " + buyer.discountedPrice(90.00));

        buyer.setBook(new LanguageBook());
        System.out.println("Bought a language book, original price is 60 while discounted is " + buyer.discountedPrice(60.00));

        buyer.setBook(new NovelBook());
        System.out.println("Bought a novel book, original price is 90 while discounted is " + buyer.discountedPrice(230.00));
    }
}
