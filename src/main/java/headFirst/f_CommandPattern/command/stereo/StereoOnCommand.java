package headFirst.f_CommandPattern.command.stereo;

import headFirst.f_CommandPattern.command.Command;
import headFirst.f_CommandPattern.receiver.Stereo;

public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(1);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
