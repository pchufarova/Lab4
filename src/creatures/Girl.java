package creatures;

import enums.Events;
import enums.Genders;
import enums.Places;
import enums.Reactions;
import interfaces.Laughable;

public class Girl extends Creatures implements Laughable {

    public Girl(String name) {

        super();
        super.name = name;
        super.gender = Genders.FEMALE;
        super.currentPlace = Places.FOREST;

    }

    @Override
    public void laugh() {

        condition = Reactions.LAUGHING;
        System.out.println(name + " " + condition.getCondition());

    }
    public void catchEvent(Events event) {

        switch (event) {

            case TANGLED_WIGS: { laugh();
                super.goTo(Places.FOREST);
                break;
            }
            case SERVANTS_IN_WIGS: { condition = Reactions.CURIOUS;
                System.out.println(name + " видит слуг в париках");
                System.out.println("Состояние " + name + ": " + condition.getCondition());
                goTo(Places.BUSH);
                break;
            }
        }

    }


//    @Override
//    public void react(boolean isBumped) {
//
//        if (isBumped) {
//            super.condition = Reactions.FEAR;
//        } else {
//
//            super.condition = Reactions.CALM;
//
//        }
//
//        System.out.println("Состояние " + name + ": " + condition.getCondition());
//
//    }

}
