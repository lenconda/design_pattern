package top.lenconda.design_pattern.task2.task2_3;

public class Main {
    public static void main(String args[]) {
        AntiVirus antiVirus1, antiVirus2, antiVirus3, antiVirus4, antiVirus5;
        Folder folder1, folder2, folder3;

        antiVirus1 = new TextFile();
        antiVirus2 = new ImageFile();
        folder1 = new Folder();
        folder1.add(antiVirus1);
        folder1.add(antiVirus2);

        antiVirus3 = new VideoFile();
        antiVirus4 = new VideoFile();
        folder2 = new Folder();
        folder2.add(antiVirus3);
        folder2.add(antiVirus4);

        antiVirus5 = new TextFile();
        folder3 = new Folder();
        folder3.add(folder1);
        folder3.add(folder2);
        folder3.add(antiVirus5);

        folder3.killVirus();
    }
}
