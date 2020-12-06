package top.lenconda.design_pattern.task1.task1_8;

public class SimpleMode extends ModeBuilder {
    public void buildMenu() {
        mainScreen.setMenu("");
    }

    public void buildPlayList() {
        mainScreen.setPlayList("");
    }

    public void buildMainWindow() {
        mainScreen.setMainWindow("Main window under simple mode.");
    }

    public void buildControlBar() {
        mainScreen.setControlBar("Control bar under simple mode.");
    }
}
