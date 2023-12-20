package creatures;

import creatures.Human;
import enums.Genders;
import enums.Reactions;

public class Duchess extends Human {

    public Duchess(String name) {

        super();
        super.name = name;
        super.gender = Genders.FEMALE;

    }

    @Override
    public void react(boolean isBumped) {

        if (isBumped) {

            super.condition = Reactions.IGNORE;

        } else {

            super.condition = Reactions.CALM;

        }

        System.out.println("Состояние " + name + ": "+ condition.getCondition());


    }

}
