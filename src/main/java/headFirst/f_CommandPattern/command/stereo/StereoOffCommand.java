package headFirst.f_CommandPattern.command.stereo;

import headFirst.f_CommandPattern.command.Command;
import headFirst.f_CommandPattern.receiver.Light;
import headFirst.f_CommandPattern.receiver.Stereo;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
