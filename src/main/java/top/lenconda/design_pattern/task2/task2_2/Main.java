package top.lenconda.design_pattern.task2.task2_2;

public class Main {
    public static void main(String args[]) {
        Output output = null;
        EncodingLanguage language = null;
        OperatingSystem system = null;
        if (output == null && language == null && system == null) {
            output = (Output) XMLUtil.getBean("Output");
            language = (EncodingLanguage) XMLUtil.getBean("EncodingLanguage");
            system = (OperatingSystem) XMLUtil.getBean("OperatingSystem");
        }
        system.setEncodingLanguage(language);
        language.setOutPut(output);
        system.type();
    }
}
