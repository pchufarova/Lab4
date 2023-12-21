package creatures;

import things.Letter;
import things.Wig;

public class Crucian extends Servant {

    public Crucian() {

        name = "Карась";
        post = "Лакей";
        wig = new Wig();
    }

    public void giveLetter(Letter letter, Frog frog) {

        System.out.println(post + " " + name + " дает письмо " + frog.post + " " + frog.name);
        speak(letter.getToWho() + " " + letter.getFromWho() + " " + letter.getTheme());
        frog.takeLetter(letter);
    }
}
