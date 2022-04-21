package classes;

import org.springframework.stereotype.Component;
@Component
public class MusicPlayer {
    private RockMusic music1;
    private ClassicalMusic music2;

    public MusicPlayer(RockMusic music1, ClassicalMusic music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic() {
        System.out.println("Playing song: " + music1.getSong());
        System.out.println("Music artist: " + music1.getSinger());
        System.out.println("Playing song: " + music2.getSong());
        System.out.println("Music artist: " + music2.getSinger());
    }

}
