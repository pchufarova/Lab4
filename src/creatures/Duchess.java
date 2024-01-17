package creatures;

import enums.Events;
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

    public void rocking(Child child) {}

    public void singTo(Child child) {}

    public void toss(Child child, Girl girl) {}

}
