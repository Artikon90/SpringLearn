package classes;

import interfaces.Music;
import org.springframework.stereotype.Component;

@Component("createClassicMusic")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Moonlight Sonata";
    }

    @Override
    public String getSinger() {
        return "Ludwig van Beethowen";
    }
}
