package headFirst.f_CommandPattern;

import headFirst.f_CommandPattern.command.Command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
