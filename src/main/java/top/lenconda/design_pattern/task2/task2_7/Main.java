package top.lenconda.design_pattern.task2.task2_7;

public class Main {
    public static void main(String args[]){
        Software software;
        software = (Software) XMLUtil.getBean();
        assert software != null;
        software.run();
    }
}
