import java.util.Objects;

public class Girl extends Human {

    public Girl(String name) {

        super();
        super.name = name;
        super.gender = Genders.FEMALE;

    }

    @Override
    public void react(boolean isBumped) {

        if (isBumped) {
            super.condition = Reactions.FEAR;
        } else {

            super.condition = Reactions.CALM;

        }

        System.out.println("Состояние " + name + ": " + condition.getCondition());

    }

}
