package classes;

import interfaces.Music;
//Just some info for test spring beans and context
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
