package classes;

import interfaces.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    ArrayList<String> classicMusic = new ArrayList<>();
    {
        classicMusic.add("J.S Bach - Toccata and Fugue");
        classicMusic.add("W.A Mozart - Dies Irae");
        classicMusic.add("L.V Beethoween - Fur Elise");
        classicMusic.add("W.A Mozart - Eine kleine Nachtmusik");
        classicMusic.add("L.V Beethoween - Moonlight Sonata");
        classicMusic.add("W.A Mozart - Symphony No. 40");
    }

    @Override
    public String getSong() {
        Random random = new Random();
        return classicMusic.get(random.nextInt(classicMusic.size()));
    }
}
