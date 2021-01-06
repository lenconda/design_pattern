package top.lenconda.design_pattern.task3.task3_8;

public class NovelBook implements Book {
    public double discountedPrice(double price) {
        if (price / 100 >= 1) {
            return price - Math.floor(price / 100) * 10;
        } else {
            return price;
        }
    }
}
