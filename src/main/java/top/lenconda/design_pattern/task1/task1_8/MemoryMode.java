package top.lenconda.design_pattern.task1.task1_8;

public class MemoryMode extends ModeBuilder {
    public void buildMenu() {
        mainScreen.setMenu("");
    }

    public void buildPlayList() {
        mainScreen.setPlayList("Play list under memory mode.");
    }

    public void buildMainWindow() {
        mainScreen.setMainWindow("Main window under memory mode.");
    }

    public void buildControlBar() {
        mainScreen.setControlBar("Control bar under memory mode.");
    }
}
