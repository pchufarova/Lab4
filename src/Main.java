import creatures.Crucian;
import creatures.Frog;
import creatures.Girl;
import enums.Events;
import enums.Places;
import things.Letter;

public class Main {

    public static void main(String[] args) {

        Girl girl = new Girl("Алиса");
        Crucian crucian = new Crucian();
        Frog frog = new Frog();
        girl.catchEvent(Events.SERVANTS_IN_WIGS);
        Letter letter = new Letter("Герцогине.", "От королевы.", "Приглашение на вечерний крокет");
        crucian.giveLetter(letter, frog);

        crucian.bowTo(frog);
        frog.bowTo(crucian);
        if (crucian.getIsBowed() == frog.getIsBowed()) {

            girl.catchEvent(crucian.getWig().entangle(frog.getWig()));
            crucian.setIsBowed(false);
            frog.setIsBowed(false);
        }
        girl.goTo(Places.BUSH);



    }

}