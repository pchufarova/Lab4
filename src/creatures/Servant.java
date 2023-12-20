package creatures;

import enums.Positions;
import interfaces.Bowable;
import things.Wig;

public abstract class Servant extends Animal implements Bowable {

    protected String post;
    protected Wig wig;

    @Override
    public void bowTo() {

        System.out.println(post + " " + name + " поклонился.");
        position = Positions.HORIZONTAL;

    }

}
