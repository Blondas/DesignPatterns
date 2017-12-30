package headFirst.f_CommandPattern.tests;

import headFirst.f_CommandPattern.command.lights.LightsOffCommand;
import headFirst.f_CommandPattern.command.lights.LightsOnCommand;
import headFirst.f_CommandPattern.receiver.Light;
import headFirst.f_CommandPattern.remoteControll.RemoteControllWithUndo;

public class RemoteLoader2 {
    public static void main(String[] args) {
        RemoteControllWithUndo remoteControll = new RemoteControllWithUndo();

        Light livingRoomLight = new Light("LivingRoom");

        LightsOnCommand livingRoomLightOn = new LightsOnCommand(livingRoomLight);
        LightsOffCommand livingRoomLightOff = new LightsOffCommand(livingRoomLight);

        remoteControll.setCommand(0, livingRoomLightOn, livingRoomLightOff);


        System.out.println(remoteControll);

        remoteControll.onButtonWasPushed(0);
        remoteControll.offButtonWasPushed(0);
        System.out.println(remoteControll);
        remoteControll.undoButtonWasPushed();
        remoteControll.offButtonWasPushed(0);
        remoteControll.onButtonWasPushed(0);
        System.out.println(remoteControll);
        remoteControll.undoButtonWasPushed();
    }
}
