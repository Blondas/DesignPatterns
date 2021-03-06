package headFirst.f_CommandPattern.command.lights;

import headFirst.f_CommandPattern.command.Command;
import headFirst.f_CommandPattern.receiver.Light;

public class LightsOffCommand implements Command {
    Light light;

    public LightsOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
