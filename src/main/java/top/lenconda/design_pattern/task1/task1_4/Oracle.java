package top.lenconda.design_pattern.task1.task1_4;

public class Oracle implements DBFactory {
    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }

    @Override
    public Statement createStatement() {
        return new OracleStatement();
    }
}
