package creatures;

import enums.Events;
import enums.Reactions;
import interfaces.Bumpable;
import interfaces.CanCatchEvent;
import things.Letter;

public class Frog extends Servant implements CanCatchEvent, Bumpable {

    public Frog() {

        name = "Головастик";
        post = "Швейцар";
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

    @Override
    public void bumped() {

        condition = Reactions.IGNORE;
        System.out.println("Состояние " + name + ": " + condition.getCondition());
        speak("Возможно, я просижу здесь до завтра... или до послезавтра.");

    }
}
