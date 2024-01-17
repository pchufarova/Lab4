package surroundings;

import creatures.Creatures;

import java.util.Objects;

public class Place {

    protected String name;

    public Place(String name) {

        this.name = name;

    }

    public String getName() { return name; }

    @Override
    public int hashCode() {

        return Objects.hash(name);

    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Place place = (Place) obj;
        return Objects.equals(name, place.name);

    }

    @Override
    public String toString() {

        return "Place_ " + name;

    }

}
