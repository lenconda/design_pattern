package top.lenconda.design_pattern.task1.task1_4;

public class MySQLConnection extends Connection {
    @Override
    public void where() {
        System.out.println("Querying using MySQL by `where`...");
    }
}
