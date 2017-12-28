package headFirst.f_CommandPattern.tests;

import headFirst.f_CommandPattern.SimpleRemoteControl;
import headFirst.f_CommandPattern.command.LightsOnCommand;
import headFirst.f_CommandPattern.receiver.Light;

public class RemoteControllTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightsOnCommand lightOn = new LightsOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}