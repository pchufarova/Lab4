package creatures;

import enums.Genders;
import enums.Reactions;
import interfaces.Bumpable;

public class Child extends Creatures implements Bumpable {

    public Child(String name, Genders gender) {

        super();
        super.name = name;
        super.gender = gender;

    }

    @Override
    public void bumped() {

        super.condition = Reactions.CRY;
        System.out.println("Состояние " + name + ": " + condition.getCondition());
    }

}
