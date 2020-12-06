package top.lenconda.design_pattern.task1.task1_3;

public class Main {
    public static void main(String args[]) {
        ImageReaderFactory gifReaderFactory = new GifReaderFactory();
        ImageReaderFactory jpgReaderFactory = new JpgReaderFactory();
        ImageReader gifReader = gifReaderFactory.createImageReader();
        ImageReader jpgReader = jpgReaderFactory.createImageReader();
        gifReader.read();
        jpgReader.read();
    }
}
