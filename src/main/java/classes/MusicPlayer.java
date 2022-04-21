package classes;

import interfaces.Music;
import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;

@AllArgsConstructor
public class MusicPlayer {
    private Music music;
//    private String playerName;
//    private int volume;

    public void playMusic() {
        System.out.println("Playing song: " + music.getSong());
        System.out.println("Music artist: " + music.getSinger());
    }

}
