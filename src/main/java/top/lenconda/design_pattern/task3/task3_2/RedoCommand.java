package top.lenconda.design_pattern.task3.task3_2;

public class RedoCommand extends Command {
    private Calculator calculator;

    public RedoCommand() {
        calculator = new Calculator();
    }

    public void execute() {
        calculator.redo();
    }
}
