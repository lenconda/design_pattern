package top.lenconda.design_pattern.task1.task1_8;

public class ScreenMode {
    private ModeBuilder modeBuilder;

    public void setModeBuilder(ModeBuilder modeBuilder) {
        this.modeBuilder = modeBuilder;
    }

    public MainScreen construct() {
        modeBuilder.buildMenu();
        modeBuilder.buildPlayList();
        modeBuilder.buildMainWindow();
        modeBuilder.buildControlBar();
        return modeBuilder.getMainScreen();
    }
}
