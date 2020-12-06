package top.lenconda.design_pattern.task1.task1_4;

public class MySQL implements DBFactory {
    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public Statement createStatement() {
        return new MySQLStatement();
    }
}
