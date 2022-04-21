package classes;

import interfaces.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StarterSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //Music music = context.getBean("createRockMusic", RockMusic.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getPlayerName());
//        System.out.println(musicPlayer.getVolume());
    }
}
