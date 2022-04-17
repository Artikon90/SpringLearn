package classes;

import interfaces.Music;
//Just some info for test Spring opportunity
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
