package headFirst.f_CommandPattern.tests;

import headFirst.f_CommandPattern.remoteControll.SimpleRemoteControl;
import headFirst.f_CommandPattern.command.GarageDoorOpenCommand;
import headFirst.f_CommandPattern.command.LightsOnCommand;
import headFirst.f_CommandPattern.receiver.GarageDoor;
import headFirst.f_CommandPattern.receiver.Light;

public class RemoteControllTest2 {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light("some light");
        GarageDoor garageDoor = new GarageDoor();

        LightsOnCommand lightOn = new LightsOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
