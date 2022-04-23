package classes;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class StarterSpring {
    static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "applicationContext.xml");
    static MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
    public static byte requiresInput() {
        System.out.println("Select genre: \n 1. Classic \n 2. Rock");
        Scanner scanner = new Scanner(System.in);
        byte userInput = scanner.nextByte();
        while (userInput < 0 && userInput > 2) {
            System.out.println("Input number not correct. Choose number from list:" +
                    " \n 1. Classic \n 2. Rock");
            userInput = scanner.nextByte();
        }
        return userInput;
    }
    public static void userSelect(byte userInput) {
        if(userInput == 1) {
            musicPlayer.playMusic(MusicGenres.CLASSICAL);
        } else if (userInput == 2) {
            musicPlayer.playMusic(MusicGenres.ROCK);
        }
        System.out.println("Want again? \n 1. Yes \n 2. No");
        Scanner scanner = new Scanner(System.in);
        byte userIsExit = scanner.nextByte();
        if(userIsExit == 1) {
            userSelect(requiresInput());
        } else if(userIsExit == 2) {
            return;
        }
    }
    public static void main(String[] args) {
        byte userInput = requiresInput();
        userSelect(userInput);
    }
}
