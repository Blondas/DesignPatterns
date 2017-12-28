package headFirst.f_CommandPattern.remoteControll;

import headFirst.f_CommandPattern.command.Command;
import headFirst.f_CommandPattern.command.NoCommand;

public class RemoteControll {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControll() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("--- Remote Controll ---\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot" + i + "] " + onCommands[i].getClass().getName()
                    + "     " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
