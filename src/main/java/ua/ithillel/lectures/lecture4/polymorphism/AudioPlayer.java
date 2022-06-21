package ua.ithillel.lectures.lecture4.polymorphism;

public class AudioPlayer {

    public static final String PLAYER_VERSION = "1.0";

    static {
        int a = 1;
        int b = a + 2;
    }

    public static void go(){
        System.out.println("Go");
    }

    public void play() {
        System.out.println("Audio player is playing...");
    }

}
