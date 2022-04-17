package classes;

import interfaces.Music;
import lombok.AllArgsConstructor;
//@AllArgsConstructor to auto-create constructor for a field 'music'
@AllArgsConstructor
public class MusicPlayer {
    private Music music;

    public void playMusic() {
        System.out.println("Playing song: " + music.getSong());
        System.out.println("Music artist: " + music.getSinger());
    }

}
