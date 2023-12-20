package creatures;

import creatures.Human;
import enums.Genders;
import enums.Reactions;
import interfaces.Goable;
import interfaces.Hideable;
import interfaces.Seeable;

public class Girl extends Human implements Goable, Hideable, Seeable {

    public Girl(String name) {

        super();
        super.name = name;
        super.gender = Genders.FEMALE;

    }

    @Override
    public void go() {}
    @Override
    public void hide() {}
    @Override
    public void see() {}


    @Override
    public void react(boolean isBumped) {

        if (isBumped) {
            super.condition = Reactions.FEAR;
        } else {

            super.condition = Reactions.CALM;

        }

        System.out.println("Состояние " + name + ": " + condition.getCondition());

    }

}
