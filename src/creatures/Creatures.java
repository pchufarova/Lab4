package creatures;

import enums.Events;
import enums.Genders;
import enums.Reactions;
import interfaces.Goable;
import interfaces.Speakable;
import surroundings.Home;
import surroundings.Place;

public abstract class Creatures implements Speakable, Goable {

    protected String name;
    protected Genders gender;
    protected Reactions condition;
    protected Place currentPlace;

    @Override
    public void speak(String speach) {

        System.out.println(name + " говорит: " + speach);

    }
    @Override
    public void ask(String question, Creatures askWho) {

        System.out.println(name + " спрашивает " + askWho.name + ": " + question);

    }

    @Override
    public void goTo(Place place) {

        System.out.println(name + " уходит в место: " + place.getName());
        currentPlace = place;

    }

    public void bumped() {

    }

    public String getName() { return name; }
    public Reactions getCondition() { return condition; }

}
