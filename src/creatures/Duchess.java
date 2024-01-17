package creatures;

import enums.Genders;
import enums.Reactions;
import interfaces.Bumpable;
import surroundings.Place;

public class Duchess extends Creatures implements Bumpable {

    public Duchess(String name, Place place) {

        super();
        super.name = name;
        super.gender = Genders.FEMALE;
        super.currentPlace = place;

    }

    public void bumped() {

        super.condition = Reactions.CALM;
        System.out.println("Состояние " + name + ": " + condition.getCondition());

    }
}
