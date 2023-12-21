package surroundings;

import creatures.Creatures;
import enums.Events;
import exceptions.HomeIsFullException;

public class Home {

    private static String name = "Дом";
    private final int MAX_CREATURES = 5;
    private Creatures[] creaturesInHome = new Creatures[MAX_CREATURES];
    private int amountOfCreatures = 0;

    public void addToHome(Creatures creature) throws HomeIsFullException {
        if (amountOfCreatures == MAX_CREATURES) throw new HomeIsFullException("Дом переполнен!");

        creaturesInHome[amountOfCreatures] = creature;
        amountOfCreatures += 1;

    }

    public String getName() { return name; }

    public class Door {

        private boolean isClosed = true;
        private static String doorName = "Дверь";

        public String getDoorName() { return doorName; }

        public Events knocked() {

            System.out.println("Никто не открывает.");
            return Events.DOOR_IS_KNOCKED;
        }

    }

    public class Kitchen {



    }

}
