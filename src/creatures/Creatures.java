package creatures;

import enums.Genders;
import enums.Places;
import enums.Reactions;
import interfaces.Goable;
import interfaces.Speakable;
import surroundings.Home;

public abstract class Creatures implements Speakable, Goable {

    protected String name;
    protected Genders gender;
    protected Reactions condition;
    protected String currentPlace;

    @Override
    public void speak(String speach) {

        System.out.println(name + " говорит: " + speach);

    }
    @Override
    public void ask(String question, Creatures askWho) {

        System.out.println(name + " спрашивает " + askWho.name + ": " + question);

    }

    @Override
    public void goTo(Places place) {

        System.out.println(name + " уходит в место: " + place.getName());
        currentPlace = place.getName();

    }

    @Override
    public void goTo(Home home) {

        System.out.println(name + " уходит в место: " + home.getName());
        currentPlace = home.getName();

    }

}
