package top.lenconda.design_pattern.task1.task1_8;

public class Main {
    public static void main(String args[]) {
        try {
            Class<?> fullModeBuilderClass = Class.forName("top.lenconda.design_pattern.task1.task1_8.FullMode");
            Class<?> memoryModeBuilderClass = Class.forName("top.lenconda.design_pattern.task1.task1_8.MemoryMode");
            Class<?> simpleModeBuilderClass = Class.forName("top.lenconda.design_pattern.task1.task1_8.SimpleMode");
            FullMode fullModeBuilder = (FullMode) fullModeBuilderClass.newInstance();
            MemoryMode memoryModeBuilder = (MemoryMode) memoryModeBuilderClass.newInstance();
            SimpleMode simpleModeBuilder = (SimpleMode) simpleModeBuilderClass.newInstance();

            ScreenMode screenMode = new ScreenMode();
            System.out.println("Full mode: ");
            screenMode.setModeBuilder(fullModeBuilder);
            MainScreen fullModeScreen = screenMode.construct();
            System.out.println(fullModeScreen.getMenu());
            System.out.println(fullModeScreen.getPlayList());
            System.out.println(fullModeScreen.getMainWindow());
            System.out.println(fullModeScreen.getControlBar());
            System.out.println("-------------------------------------");
            System.out.println("Memory mode: ");
            screenMode.setModeBuilder(memoryModeBuilder);
            MainScreen memoryModeScreen = screenMode.construct();
            System.out.println(memoryModeScreen.getMenu());
            System.out.println(memoryModeScreen.getPlayList());
            System.out.println(memoryModeScreen.getMainWindow());
            System.out.println(memoryModeScreen.getControlBar());
            System.out.println("-------------------------------------");
            System.out.println("Simple mode: ");
            screenMode.setModeBuilder(simpleModeBuilder);
            MainScreen simpleModeScreen = screenMode.construct();
            System.out.println(simpleModeScreen.getMenu());
            System.out.println(simpleModeScreen.getPlayList());
            System.out.println(simpleModeScreen.getMainWindow());
            System.out.println(simpleModeScreen.getControlBar());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
