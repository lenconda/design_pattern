package top.lenconda.design_pattern.task1.task1_8;

public class FullMode extends ModeBuilder {
    public void buildMenu() {
        mainScreen.setMenu("Menu under full mode.");
    }

    public void buildPlayList() {
        mainScreen.setPlayList("Play list under full mode.");
    }

    public void buildMainWindow() {
        mainScreen.setMainWindow("Main window under full mode.");
    }

    public void buildControlBar() {
        mainScreen.setControlBar("Control bar under full mode.");
    }
}
