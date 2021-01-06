package top.lenconda.design_pattern.task3.task3_2;

public class ComposedCommand extends Command {
    private Command[] commands;

    public ComposedCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
