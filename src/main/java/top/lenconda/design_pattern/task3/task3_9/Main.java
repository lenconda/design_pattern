package top.lenconda.design_pattern.task3.task3_9;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Buyer buyer = new Buyer();
        product.addObserver(buyer);
        product.setName("Porsche Taycan Turbo S 2019");
        product.setPrice(1798000.00);
        product.setPrice(1628900.00);

        product.setName("Benz S 450L 2020");
        product.setPrice(1115800.00);
        product.setPrice(1035100.00);
    }
}
