package headFirst.f_CommandPattern.tests;

import headFirst.f_CommandPattern.command.*;
import headFirst.f_CommandPattern.receiver.CeilingFan;
import headFirst.f_CommandPattern.receiver.GarageDoor;
import headFirst.f_CommandPattern.receiver.Light;
import headFirst.f_CommandPattern.receiver.Stereo;
import headFirst.f_CommandPattern.remoteControll.RemoteControll;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControll remoteControll = new RemoteControll();

        Light livingRoomLight = new Light("LivingRoom");
        Light kitchenLight= new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightsOnCommand livingRoomLightOn = new LightsOnCommand(livingRoomLight);
        LightsOffCommand livingRoomLightOff = new LightsOffCommand(livingRoomLight);

        LightsOnCommand kitchenLightOn = new LightsOnCommand(kitchenLight);
        LightsOffCommand kitchenLightOff = new LightsOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClos = new GarageDoorCloseCommand(garageDoor);

        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
    }
}
