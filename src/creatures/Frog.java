package creatures;

import enums.Events;
import enums.Reactions;
import interfaces.CanCatchEvent;
import things.Letter;
import things.Wig;

public class Frog extends Servant implements CanCatchEvent {

    public Frog() {

        name = "Головастик";
        post = "Швейцар";
        Wig wig = new Wig();
    }

    public void takeLetter(Letter letter) {

        System.out.println(post + " " + name + " берет письмо.");
        speak(letter.getFromWho() + " " + letter.getToWho() + " " + letter.getTheme());
    }
    @Override
    public void catchEvent(Events event) {

        switch (event) {

            case DOOR_IS_KNOCKED: { speak("Стучать нет никакого смысла, барышня."); }
        }
    }

    public Events bumped() {

        condition = Reactions.IGNORE;
        System.out.println("Состояние " + name + ": " + condition.getCondition());
        speak("Возможно, я просижу здесь до завтра... или до послезавтра.");
        return Events.BUMP_EVENT;

    }
}
