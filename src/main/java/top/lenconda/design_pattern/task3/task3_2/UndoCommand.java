package top.lenconda.design_pattern.task3.task3_2;

public class UndoCommand extends Command {
    private Calculator calculator;

    public UndoCommand() {
        calculator = new Calculator();
    }

    public void execute() {
        calculator.undo();
    }
}
