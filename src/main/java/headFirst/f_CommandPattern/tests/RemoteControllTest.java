package headFirst.f_CommandPattern.tests;

import headFirst.f_CommandPattern.remoteControll.SimpleRemoteControl;
import headFirst.f_CommandPattern.command.lights.LightsOnCommand;
import headFirst.f_CommandPattern.receiver.Light;

public class RemoteControllTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("some light");
        LightsOnCommand lightOn = new LightsOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
