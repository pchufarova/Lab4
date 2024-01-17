package creatures;

import enums.Genders;
import surroundings.Place;
import things.Things;

public class Cook extends Creatures {

    public Cook(String name, Place place) {

        super();
        super.name = name;
        super.gender = Genders.FEMALE;
        super.currentPlace = place;

    }

    public void throwInto(Things thing, Creatures creature) {

        thing.flyInto(creature);

    }

}
