package things;

import java.util.Objects;

public class Tableware extends Things { ;

    public Tableware(String name) {

        super();
        this.name = name;
        Things.coefficient = 10;
    }

    @Override
    protected boolean is_thing_bumped() {

        return ((name.length() + Things.coefficient) * Math.random() > Things.LIMIT);
    }
}
