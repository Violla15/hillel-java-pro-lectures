package ua.ithillel.lectures.lecture4;

import ua.ithillel.lectures.lecture4.encapsulation.Encapsulation;
import ua.ithillel.lectures.lecture4.immutable.ImmutableStudent;
import ua.ithillel.lectures.lecture4.polymorphism.AudioPlayer;
import ua.ithillel.lectures.lecture4.polymorphism.CDPlayer;
import ua.ithillel.lectures.lecture4.polymorphism.USBPlayer;

import java.util.ArrayList;
import java.util.List;

public class Lecture4 extends Encapsulation {

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.myLong = 11123;
        Encapsulation.staticString = "A";

        ImmutableStudent student = new ImmutableStudent("Ivan", "ivan@gmail.com", new String[]{"QA", "Java"});
        String email = student.getEmail();
        email = "new@mail.com";
        String[] groups = student.getGroups();
        groups[0] = "A";

        System.out.println(student);

        AudioPlayer.go();
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play();

        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.play();

        USBPlayer usbPlayer = new USBPlayer();
        usbPlayer.play();

        List<AudioPlayer> players = new ArrayList<>();
        players.add(audioPlayer);
        players.add(cdPlayer);
        players.add(usbPlayer);

        play(players);
    }

    private static void play(List<AudioPlayer> players) {
        for (AudioPlayer player : players) {
            player.play();
        }
    }

}
