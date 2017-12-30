package headFirst.f_CommandPattern.command.lights;

import headFirst.f_CommandPattern.command.Command;
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

    @Override
    public void undo() {
        light.off();
    }
}
