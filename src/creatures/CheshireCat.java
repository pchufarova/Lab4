package creatures;

import enums.Genders;
import enums.Reactions;
import surroundings.Place;

public class CheshireCat extends Creatures {

    public CheshireCat(Place place) {
        super();
        super.name = "Чеширский кот";
        super.gender = Genders.MALE;
        super.condition = Reactions.SMILING;
        super.currentPlace = place;
    }


}
