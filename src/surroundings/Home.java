package surroundings;

import creatures.Creatures;
import enums.Events;
import enums.Reactions;
import exceptions.DeterminationException;

import java.util.Objects;

public class Home extends Place {
    private Kitchen kitchen;
    private Door door;

    public Home() {

        super("Дом");
        this.kitchen = new Kitchen();
        this.door = this.new Door();

    }

    public Kitchen getKitchen() { return kitchen; }
    public Door getDoor() { return door; }

    @Override
    public int hashCode() {

        return Objects.hash(name, kitchen, door);

    }



    public static class Kitchen extends Place{

        public Kitchen() {

            super("Кухня");

        }

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
