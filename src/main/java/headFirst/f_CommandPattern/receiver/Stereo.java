package headFirst.f_CommandPattern.receiver;

public class Stereo {
    public void on() {
        System.out.println("stereo on");
    }

    public void off() {
        System.out.println("stereo off");
    }

    public void setCd() {
        System.out.println("set cd");
    }

    public void setDvd() {
        System.out.println("set dvd");
    }
    public void setRadio() {
        System.out.println("set radio");
    }
    public void setVolume(int val) {
        System.out.println("set volume to " + val);
    }
}
