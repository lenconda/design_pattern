package top.lenconda.design_pattern.task3.task3_2;

public class Main {
    public static void main(String[] args) {
        Command redoCommand;
        Command undoCommand;

        redoCommand = new RedoCommand();
        undoCommand = new UndoCommand();

        Command[] commands = {redoCommand, undoCommand};

        ComposedCommand compositeCommand = new ComposedCommand(commands);
        compositeCommand.execute();
    }
}
