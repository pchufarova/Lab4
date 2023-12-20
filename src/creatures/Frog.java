package creatures;

import things.Letter;
import things.Wig;

public class Frog extends Servant {

    public Frog() {

        name = "Головастик";
        post = "Швейцар";
        Wig wig = new Wig();

    }

    public void takeLetter(Letter letter) {

        System.out.println(post + " " + name + " берет письмо.");
        speak(letter.getFromWho() + " " + letter.getToWho() + " " + letter.getTheme());

    }

}
