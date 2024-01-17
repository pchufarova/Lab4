package creatures;

import enums.Events;
import interfaces.Bowable;
import interfaces.Entanglable;

public class Servant extends Creatures implements Bowable {

    protected String post;

    @Override
    public Events bowTo(Servant servant) {

        System.out.println(post + " " + name + " поклонился " + servant.post + " " + servant.name);
        class Wig implements Entanglable {

            public Events entangle() {
                System.out.println("Парики чуть не спутались");
                return Events.TANGLED_WIGS;
            }
        }

        Wig wig = new Wig();
        return wig.entangle();

    }

}
