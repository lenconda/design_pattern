package top.lenconda.design_pattern.task2.task2_2;

public abstract class EncodingLanguage {
    Output output;

    public void setOutPut(Output output){
        this.output = output;
    }

    public abstract void language(String system);
}
