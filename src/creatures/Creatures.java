package creatures;

import enums.Genders;
import enums.Places;
import enums.Reactions;
import interfaces.Goable;
import interfaces.Speakable;

public abstract class Creatures implements Speakable, Goable {

    protected String name;
    protected Genders gender;
    protected Reactions condition;
    protected Places currentPlace;

    @Override
    public void speak(String speach) {

        System.out.println(name + " говорит: " + speach);

    }
    @Override
    public void goTo(Places place) {

        System.out.println(name + " уходит в место: " + place.getName());
        currentPlace = place;

    }

}
