package classes;

import interfaces.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
public class RockMusic implements Music {
    ArrayList<String> rockMusic = new ArrayList<>();
    {
        rockMusic.add("Axel Rudi Pell - I see fire");
        rockMusic.add("Deep Purple - Smoke on the water");
        rockMusic.add("Guns N' Roses - Welcome th the jungle");
        rockMusic.add("Accept - Future land");
        rockMusic.add("Led Zeppelin - Immigrant's song");
        rockMusic.add("Queen - We will rock you");
    }
    @Override
    public String getSong() {
        Random random = new Random();
        return rockMusic.get(random.nextInt(rockMusic.size()));
    }

}
