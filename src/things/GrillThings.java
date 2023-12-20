package things;

import java.util.Objects;

public class GrillThings extends Things {


    public GrillThings(String name) {

        super();
        this.name = name;
        Things.coefficient = 20;

    }

    @Override
    protected boolean is_thing_bumped() {

        return (Things.coefficient * Math.random() + name.length() > Things.LIMIT);
    }
}
