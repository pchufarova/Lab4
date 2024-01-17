package things;


public class GrillThings extends Things {


    public GrillThings(String name) {

        super();
        this.name = name;
        coefficient = 20;

    }

    @Override
    protected boolean is_thing_bumped() {

        return (coefficient * Math.random() + name.length() > Things.LIMIT);
    }
}
