package creatures;

import enums.Events;
import enums.Genders;
import enums.Places;
import enums.Reactions;
import interfaces.CanCatchEvent;
import interfaces.Laughable;
import surroundings.Home;

public class Girl extends Creatures implements Laughable, CanCatchEvent {

    private int voiceVolume = 5;

    public Girl(String name) {

        super();
        super.name = name;
        super.gender = Genders.FEMALE;
        super.currentPlace = Places.FOREST.getName();

    }

    @Override
    public void laugh() {

        condition = Reactions.LAUGHING;
        System.out.println(name + " " + condition.getCondition());

    }

    public Events knockTheDoor(Home.Door door) {

        System.out.println(name + " стучит в дверь.");
        return door.knocked();

    }
    public void ask(String question, Frog askWho) {

        super.ask(question, askWho);
        if (voiceVolume < 15) {

            askWho.condition = Reactions.IGNORE;
            System.out.println("Состояние " + askWho.name + ": " + askWho.condition.getCondition());
            voiceVolume += 5;
        } else {

            askWho.speak("А кто сказал, что вы вообще должны попасть в дом, барышня?");
            condition = Reactions.ANNOYED;
            System.out.println("Состояние " + name + ": " + condition.getCondition());
            voiceVolume = 5;


        }


    }

    public void ask(String question, Duchess askWho) {

        super.ask(question, askWho);


    }



    @Override
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
            } case CRUCIAN_GOES_AWAY: { condition = Reactions.CALM;
                System.out.println(name + " насмеялась. Состояние:" + condition.getCondition());
                goTo(Places.BUSH);
                System.out.println("Карася уже не было.");

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
