package classes;

import interfaces.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class MusicPlayer {
    private final Music music1;
    private final Music music2;

@Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(MusicGenres genres) {
        if (genres == MusicGenres.CLASSICAL) {
            System.out.println("Playing song: " + music2.getSong());
        } else if (genres == MusicGenres.ROCK) {
            System.out.println("Playing song: " + music1.getSong());
        }
    }

}
