package top.lenconda.design_pattern.task1.task1_6;

public class Main {
    public static void main(String args[]) {
        ConnectionPoolSingleton connection1, connection2;
        try {
            connection1 = ConnectionPoolSingleton.getInstance();
            connection1.manageJobs();
        } catch (ConnectionPoolException e) {
            System.out.println(e.getMessage());
        }
        try {
            connection2 = ConnectionPoolSingleton.getInstance();
            connection2.manageJobs();
        } catch (ConnectionPoolException e) {
            System.out.println(e.getMessage());
        }
    }
}
