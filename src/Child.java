import java.util.Objects;

public class Child extends Human {

    public Child(String name, Genders gender) {

        super();
        super.name = name;
        super.gender = gender;

    }

    @Override
    public void react(boolean isBumped) {

        super.condition = Reactions.CRY;
        System.out.println("Состояние " + name + ": " + condition.getCondition());

    }

}
