package top.lenconda.design_pattern.task2.task2_5;

public class MainFrame {
    private final Memory memory;
    private final CPU cpu;
    private final HardDisk hardDisk;
    private final OS os;

    public MainFrame() {
        memory = new Memory();
        cpu = new CPU();
        hardDisk = new HardDisk();
        os = new OS();
    }

    public void on() {
        memory.check();
        cpu.run();
        hardDisk.read();
        os.load();
        System.out.println("Startup successful");
    }

    public void off() {
        memory.checkError();
        cpu.runError();
        hardDisk.readError();
        os.loadError();
        System.out.println("Startup errored");
    }
}
