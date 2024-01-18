package creatures;

import enums.Genders;
import enums.Reactions;
import interfaces.Goable;
import interfaces.Speakable;
import surroundings.Place;

import java.util.Objects;

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
    public void setCondition(Reactions react) { condition = react; }

    @Override
    public int hashCode() {

        return Objects.hash(name, gender, condition, currentPlace);

    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Creatures creature = (Creatures) obj;
        return Objects.equals(name, creature.name);

    }

    @Override
    public String toString() {

        return "Creature_ " + name;

    }

}
