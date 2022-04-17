package classes;

import interfaces.Music;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StarterSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music music = context.getBean("createClassicMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        music = context.getBean("createRockMusic", Music.class);
        MusicPlayer musicPlayer1 = new MusicPlayer(music);
        musicPlayer1.playMusic();
        context.close();
    }
}
