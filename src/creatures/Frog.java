package creatures;

import enums.Events;
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

            case DOOR_IS_KNOCKED: {

                speak("Стучать нет никакого смысла, барышня.");

            }


        }

    }
}
