import creatures.*;
import enums.Events;
import enums.Genders;
import enums.Reactions;
import exceptions.DeterminationException;
import interfaces.Smileable;
import surroundings.Home;
import surroundings.Place;
import things.GrillThings;
import things.Letter;
import things.Tableware;
import things.Things;

public class Main {

    public static void main(String[] args) {

        Place forest = new Place("Лес");
        Home home = new Home();

        Girl girl = new Girl("Алиса", forest);
        Crucian crucian = new Crucian();
        Frog frog = new Frog();
        Duchess duchess = new Duchess("Герцогиня", home.getKitchen());
        Child child = new Child("Ребенок", Genders.MALE);
        Cook cook = new Cook("Повариха", home.getKitchen());

        Tableware dish = new Tableware("Блюдо");
        dish.setCoefficient(100);
        Tableware pan = new Tableware("Сковородка");
        Tableware plate = new Tableware("Тарелка");
        Tableware cup = new Tableware("Чашка");
        GrillThings firepoker = new GrillThings("Кочерга");
        GrillThings scoop = new GrillThings("Совок");
        GrillThings tongs = new GrillThings("Щипцы для угля");
        Things[] things = {firepoker, scoop, tongs, pan, plate, cup};

        girl.catchEvent(Events.SERVANTS_IN_WIGS);
        Letter letter = new Letter("Герцогине.", "От королевы.", "Приглашение на вечерний крокет");
        crucian.giveLetter(letter, frog);
        girl.catchEvent(crucian.bowTo(frog));

        girl.catchEvent(Events.CRUCIAN_GOES_AWAY);
        frog.catchEvent(girl.knockTheDoor(home.getDoor()));
        girl.ask("Извините, а как же мне тогда попасть в дом?", frog);
        girl.ask("Как же мне попасть в дом?", frog);
        dish.flyInto(frog);
        girl.ask("КАК МНЕ ПОПАСТЬ В ДОМ?", frog);
        try {
            home.getDoor().openBy(girl);
            Smileable cheshireCat = new Smileable() {
                @Override
                public void smile() {

                    System.out.println("Чеширский кот улыбнулся.");
                    girl.setCondition(Reactions.CURIOUS);
                    System.out.println("Состояние " + girl.getName() + ": " + girl.getCondition().getCondition());
                    girl.ask("Почему ваш кот так улыбается?", duchess);
                }
            };

            cheshireCat.smile();
            for (Things thing : things) {

                cook.throwInto(thing, duchess);
                cook.throwInto(thing, child);

            }

        } catch (DeterminationException ex) {

            System.out.println(ex.getMessage());
        }

    }
}