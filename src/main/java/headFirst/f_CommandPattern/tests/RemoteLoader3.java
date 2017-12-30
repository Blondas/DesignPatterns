package headFirst.f_CommandPattern.tests;

import headFirst.f_CommandPattern.command.ceilingFan.CeilingFanHighCommand;
import headFirst.f_CommandPattern.command.ceilingFan.CeilingFanMediumCommand;
import headFirst.f_CommandPattern.command.ceilingFan.CeilingFanOffCommand;
import headFirst.f_CommandPattern.receiver.CeilingFan;
import headFirst.f_CommandPattern.remoteControll.RemoteControllWithUndo;

public class RemoteLoader3 {
    public static void main(String[] args) {
        RemoteControllWithUndo remoteControll = new RemoteControllWithUndo();

        CeilingFan ceilingFan = new CeilingFan("LivingRoom");
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);


        remoteControll.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControll.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControll.onButtonWasPushed(0);
        remoteControll.offButtonWasPushed(0);
        System.out.println(remoteControll);
        remoteControll.undoButtonWasPushed();

        remoteControll.offButtonWasPushed(1);
        System.out.println(remoteControll);
        remoteControll.undoButtonWasPushed();
    }
}
