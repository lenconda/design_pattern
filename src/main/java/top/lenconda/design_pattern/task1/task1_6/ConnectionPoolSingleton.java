package top.lenconda.design_pattern.task1.task1_6;

public class ConnectionPoolSingleton {
    private static ConnectionPoolSingleton instance = null;

    public static ConnectionPoolSingleton getInstance() throws ConnectionPoolException {
        if (instance == null) {
            instance = new ConnectionPoolSingleton();
            System.out.println("Connection pool created.");
        } else {
            throw new ConnectionPoolException("Connection pool is working...");
        }
        return instance;
    }

    public void manageJobs() {
        System.out.println("Managing connection jobs...");
    }
}
