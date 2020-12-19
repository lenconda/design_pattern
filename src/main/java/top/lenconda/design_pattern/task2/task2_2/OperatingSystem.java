package top.lenconda.design_pattern.task2.task2_2;

public abstract class OperatingSystem {
    EncodingLanguage encodingLanguage;

    public void setEncodingLanguage(EncodingLanguage encodingLanguage) {
        this.encodingLanguage = encodingLanguage;
    }

    public abstract void type();
}
