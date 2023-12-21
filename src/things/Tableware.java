package things;

import java.util.Objects;

public class Tableware extends Things { ;

    public Tableware(String name) {

        super();
        this.name = name;
        coefficient = 10;
    }

    @Override
    protected boolean is_thing_bumped() {

        return ((name.length() + coefficient) * Math.random() > Things.LIMIT);
    }
}
