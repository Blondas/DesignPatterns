package headFirst.f_CommandPattern.tests;

import headFirst.f_CommandPattern.command.ceilingFan.CeilingFanOffCommand;
import headFirst.f_CommandPattern.command.ceilingFan.CeilingFanOnCommand;
import headFirst.f_CommandPattern.command.garageDoor.GarageDoorCloseCommand;
import headFirst.f_CommandPattern.command.garageDoor.GarageDoorOpenCommand;
import headFirst.f_CommandPattern.command.lights.LightsOffCommand;
import headFirst.f_CommandPattern.command.lights.LightsOnCommand;
import headFirst.f_CommandPattern.command.stereo.StereoOffCommand;
import headFirst.f_CommandPattern.command.stereo.StereoOnCommand;
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

        remoteControll.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControll.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControll.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControll.setCommand(3, stereoOn, stereoOff);

        System.out.println(remoteControll);

        remoteControll.onButtonWasPushed(0);
        remoteControll.offButtonWasPushed(0);
        remoteControll.onButtonWasPushed(1);
        remoteControll.offButtonWasPushed(1);
        remoteControll.onButtonWasPushed(2);
        remoteControll.offButtonWasPushed(2);
        remoteControll.onButtonWasPushed(3);
        remoteControll.offButtonWasPushed(3);
    }
}
