package creatures;

import enums.Events;
import enums.Genders;
import enums.Reactions;
import interfaces.CanCatchEvent;
import interfaces.Laughable;
import surroundings.Home;
import surroundings.Place;

public class Girl extends Creatures implements Laughable, CanCatchEvent {

    private int voiceVolume = 5;
    private Place startPlace;

    public Girl(String name, Place startPlace) {

        super();
        super.name = name;
        super.gender = Genders.FEMALE;
        this.startPlace = startPlace;
        currentPlace = startPlace;

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
            askWho.condition = Reactions.CALM;
            condition = Reactions.ANNOYED;
            System.out.println("Состояние " + name + ": " + condition.getCondition());
            voiceVolume = 5;
            condition = Reactions.DETERMINATION;

        }
    }
    public void ask(String question, Duchess askWho) {

        super.ask(question, askWho);
        askWho.speak("Это чеширский кот, вот почему.");


    }

    @Override
    public void catchEvent(Events event) {

        switch (event) {

            case TANGLED_WIGS: { laugh();
                super.goTo(startPlace);
                break;
            }
            case SERVANTS_IN_WIGS: { condition = Reactions.CURIOUS;
                System.out.println(name + " видит слуг в париках");
                System.out.println("Состояние " + name + ": " + condition.getCondition());
                goTo(event.getBush());
                break;
            }
            case CRUCIAN_GOES_AWAY: { condition = Reactions.CALM;
                System.out.println(name + " насмеялась. Состояние:" + condition.getCondition());
                goTo(event.getBush());
                System.out.println("Карася уже не было.");

            }
        }
    }

    public void saw(CheshireCat cat) {


    }
}
