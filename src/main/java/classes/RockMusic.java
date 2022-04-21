package classes;

import interfaces.Music;
import org.springframework.stereotype.Component;

@Component("createRockMusic")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "We will rock you!";
    }

    @Override
    public String getSinger() {
        return "Queen";
    }
}
