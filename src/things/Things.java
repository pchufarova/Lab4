package things;

import creatures.Creatures;
import exceptions.NegativeCoefficientException;
import interfaces.Flyable;
import java.util.Objects;

public abstract class Things implements Flyable {

    protected String name;
    protected static final int LIMIT = 12;
    protected int coefficient;

    protected abstract boolean is_thing_bumped();

    public String getName() { return name; }
    public void setCoefficient(int coefficient) {
        if (coefficient <= 0) {
            throw new NegativeCoefficientException();
        } else {
            this.coefficient = coefficient;
        }
    }

    @Override
    public void flyInto(Creatures... creatures) {

        for (Creatures creature: creatures) {

            System.out.println(name + " летит в " + creature.getName());

            if (is_thing_bumped()) {

                System.out.println(name + " врезается в " + creature.getName());
                creature.bumped();

            } else {

                System.out.println(name + " не попадает в " + creature.getName());

            }
        }
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, LIMIT, coefficient);

    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Things things = (Things) obj;
        return Objects.equals(name, things.name);

    }

    @Override
    public String toString() {

        return "Things_ " + name;

    }

}
