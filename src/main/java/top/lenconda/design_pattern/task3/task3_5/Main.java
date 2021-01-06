package top.lenconda.design_pattern.task3.task3_5;

public class Main {
    public static void main(String[] args) {
        UserInfo user = new UserInfo();
        Memory previousMemory = new Memory();
        Memory currentMemory = new Memory();

        user.setName("porsche");
        user.setEmail("porsche@example");
        user.setPhone("13129983307");
        System.out.println("State 1: " + user.toString());
        previousMemory.setMemento(user.saveUser());

        user.setName("mercedes-benz");
        user.setEmail("mercedes-benz@example.com");
        user.setPhone("13890127723");
        System.out.println("State 2: " + user.toString());
        currentMemory.setMemento(user.saveUser());

        user.setEmail("lamborghini");
        user.setPhone("lamborghini@example.com");
        System.out.println("State 3: " + user.toString());

        user.restoreUser(currentMemory.getMemento());
        System.out.println("State 2: " + user.toString());

        user.restoreUser(previousMemory.getMemento());
        System.out.println("State 1: " + user.toString());
    }
}
