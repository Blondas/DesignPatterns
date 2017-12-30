package headFirst.f_CommandPattern.tests;

import headFirst.f_CommandPattern.command.Command;
import headFirst.f_CommandPattern.command.MacroCommand;
import headFirst.f_CommandPattern.command.lights.LightsOffCommand;
import headFirst.f_CommandPattern.command.lights.LightsOnCommand;
import headFirst.f_CommandPattern.command.stereo.StereoOffCommand;
import headFirst.f_CommandPattern.command.stereo.StereoOnCommand;
import headFirst.f_CommandPattern.receiver.Light;
import headFirst.f_CommandPattern.receiver.Stereo;
import headFirst.f_CommandPattern.remoteControll.RemoteControllWithUndo;

import javax.crypto.Mac;

public class PartyModeTest {
    public static void main(String[] args) {
        Light light = new Light("Living Room");
        Stereo stereo = new Stereo();

        LightsOnCommand lightsOn = new LightsOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);

        LightsOffCommand lightsOff = new LightsOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] partyOn = {lightsOn, stereoOn};
        Command[] partyOff = {lightsOff, stereoOff};

        MacroCommand partyOnMacro= new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        RemoteControllWithUndo remoteControll = new RemoteControllWithUndo();
        remoteControll.setCommand(0, partyOnMacro, partyOffMacro);


        System.out.println(remoteControll);

        System.out.println("======== PUSHING MACRO ON ====");
        remoteControll.onButtonWasPushed(0);

        System.out.println("========= PUSHING MACRO OFF ======");
        remoteControll.offButtonWasPushed(0);

        System.out.println("====== UNDO MACRO ====");
        remoteControll.undoButtonWasPushed();
    }
}
