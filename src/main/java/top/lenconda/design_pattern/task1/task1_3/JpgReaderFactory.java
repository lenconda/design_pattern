package top.lenconda.design_pattern.task1.task1_3;

public class JpgReaderFactory extends ImageReaderFactory {
    @Override
    public JpgReader createImageReader() {
        return new JpgReader();
    }
}
