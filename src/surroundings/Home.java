package surroundings;

import creatures.Creatures;
import enums.Events;
import enums.Reactions;
import exceptions.DeterminationException;
import exceptions.HomeIsFullException;

public class Home {

    private static String name = "Дом";
    private final int MAX_CREATURES = 5;
    private Creatures[] creaturesInHome = new Creatures[MAX_CREATURES];
    private int amountOfCreatures = 0;
    public Kitchen kitchen = new Kitchen();
    public Door door = new Door();
    public void addToHome(Creatures creature) throws HomeIsFullException {
        if (amountOfCreatures == MAX_CREATURES) throw new HomeIsFullException("Дом переполнен!");

        creaturesInHome[amountOfCreatures] = creature;
        amountOfCreatures += 1;

    }

    public String getName() { return name; }

    public class Kitchen {

        private String kitchenName = "Кухня";

        public String getKitchenName() { return kitchenName; }

    }

    public class Door {

        private boolean isClosed = true;
        private static String doorName = "Дверь";

        public String getDoorName() { return doorName; }

        public Events knocked() {

            System.out.println("Никто не открывает.");
            return Events.DOOR_IS_KNOCKED;
        }

        public void openBy(Creatures creature) throws DeterminationException { //exceptionы по факту одинаковые?...

            if (creature.getCondition() != Reactions.DETERMINATION) throw new DeterminationException("Не хватает решимости открыть дверь");

            isClosed = false;
            System.out.println(creature.getName() + " решительно открывает дверь");
            creature.goTo(kitchen);
        }


    }
}
