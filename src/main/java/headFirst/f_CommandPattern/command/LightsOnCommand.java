package headFirst.f_CommandPattern.command;

import headFirst.f_CommandPattern.receiver.Light;

public class LightsOnCommand implements Command {
    Light light;

    public LightsOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
