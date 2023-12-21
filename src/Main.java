import creatures.*;
import enums.Events;
import enums.Genders;
import enums.Places;
import exceptions.HomeIsFullException;
import surroundings.Home;
import things.Letter;

public class Main {

    public static void main(String[] args) {

        Girl girl = new Girl("Алиса");
        Crucian crucian = new Crucian();
        Frog frog = new Frog();
        Duchess duchess = new Duchess("Герцогиня");
        Child child = new Child("Ребенок", Genders.MALE);
        Cook cook = new Cook();
        CheshireCat cat = new CheshireCat();
        Home home = new Home();
        Home.Door door = home.new Door();

        try {
            home.addToHome(duchess);
            home.addToHome(child);
            home.addToHome(cook);
            home.addToHome(cat); //еще надо исключение проверяющее не зашел ли в дом один и тот же человек дважды - такого просто не може быть

        } catch (HomeIsFullException ex) {

            System.out.println(ex.getMessage());

        }


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

        girl.catchEvent(Events.CRUCIAN_GOES_AWAY);
        frog.catchEvent(girl.knockTheDoor(door));



    }

}