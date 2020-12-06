package top.lenconda.design_pattern.task1.task1_3;

public class GifReaderFactory extends ImageReaderFactory {
    @Override
    public GifReader createImageReader() {
        return new GifReader();
    }
}
