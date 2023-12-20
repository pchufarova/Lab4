package creatures;

import enums.Genders;
import enums.Reactions;

import java.util.Objects;

public abstract class Human {

    protected Genders gender;
    protected String name;
    protected Reactions condition = Reactions.CALM;

    public Human() {}

    public abstract void react(boolean isBumped);


    public String getName() {

        return name;

    }

    public Genders getGender() {

        return gender;

    }

    public Reactions getCondition() {

        return condition;

    }

    @Override
    public int hashCode() {

        return Objects.hash(name, gender, condition);

    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Human human = (Human) obj;
        return (Objects.equals(name, human.name) && Objects.equals(gender, human.gender));

    }

    @Override
    public String toString() {

        return "Human_ " + name;

    }

}
