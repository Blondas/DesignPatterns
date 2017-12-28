package headFirst.f_CommandPattern.command;

public class NoCommand implements Command {
    @Override
    public void execute() {}

    @Override
    public void undo() { }
}
