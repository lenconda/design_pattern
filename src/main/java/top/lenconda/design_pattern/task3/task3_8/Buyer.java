package top.lenconda.design_pattern.task3.task3_8;

public class Buyer {
    private Book book;

    public void setBook(Book book) {
        this.book = book;
    }

    public double discountedPrice(double price) {
        book.discountedPrice(price);
        return price;
    }
}
