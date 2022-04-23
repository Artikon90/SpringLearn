package classes;

import interfaces.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

@Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
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
