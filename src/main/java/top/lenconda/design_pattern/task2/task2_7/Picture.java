package top.lenconda.design_pattern.task2.task2_7;

public class Picture implements Software {
    private final Application application = new Application();

    @Override
    public void run() {
        application.run();
    }
}
