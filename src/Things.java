import java.util.Objects;

public abstract class Things implements Flyable, Bumpable {

    protected String name;
    protected static final int LIMIT = 12;
    protected static int coefficient;

    protected abstract boolean is_thing_bumped();

    public String getName() {

        return name;
    }

    @Override
    public void flyInto(Human... humans) {

        for (Human human: humans) {

            System.out.println(name + " летит в " + human.getName());

            if (is_thing_bumped()) {

                bump(human);

            } else {

                System.out.println(name + " не попадает в " + human.getName());
                human.react(false);

            }
        }
    }

    @Override
    public void bump(Human human) {

        System.out.println(name + " врезается в " + human.getName());
        human.react(true);

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
