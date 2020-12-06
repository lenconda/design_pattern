package top.lenconda.design_pattern.task1.task1_4;

public interface DBFactory {
    public Connection createConnection();
    public Statement createStatement();
}
