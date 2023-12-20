package creatures;

import creatures.Human;
import enums.Genders;
import enums.Reactions;

public class Child extends Creatures {

    public Child(String name, Genders gender) {

        super();
        super.name = name;
        super.gender = gender;

    }

//    @Override
//    public void react(boolean isBumped) {
//
//        super.condition = Reactions.CRY;
//        System.out.println("Состояние " + name + ": " + condition.getCondition());
//
//    }

}
