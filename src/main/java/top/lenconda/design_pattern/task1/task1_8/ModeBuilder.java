package top.lenconda.design_pattern.task1.task1_8;

public abstract class ModeBuilder {
    protected MainScreen mainScreen = new MainScreen();

    public abstract void buildMenu();
    public abstract void buildPlayList();
    public abstract void buildMainWindow();
    public abstract void buildControlBar();

    public MainScreen getMainScreen() {
        return mainScreen;
    }
}
