package top.lenconda.design_pattern.task1.task1_9;

public class Main {
    public static void main(String args[]) {
        Address address = new Address("People's Republic of China", "Jiangxi", "Nanchang");
        Customer customer1 = new Customer("Peng Hanlin", address);
        Customer customer2 = null;
        try {
            customer2 = (Customer) customer1.deepClone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Customer 1: " + customer1.toString());
        System.out.println("Customer 2: " + customer2.toString());
    }
}
