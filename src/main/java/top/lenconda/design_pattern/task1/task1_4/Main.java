package top.lenconda.design_pattern.task1.task1_4;

public class Main {
    public static void main(String args[]) {
        Oracle oracle = new Oracle();
        MySQL mySQL = new MySQL();
        Connection oracleConnect = oracle.createConnection();
        Statement oracleStatement = oracle.createStatement();
        oracleConnect.where();
        oracleStatement.execute();
        Connection mysqlConnect = mySQL.createConnection();
        Statement mysqlStatement = mySQL.createStatement();
        mysqlConnect.where();
        mysqlStatement.execute();
    }
}
