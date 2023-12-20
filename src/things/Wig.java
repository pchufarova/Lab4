package things;

import enums.Events;
import interfaces.Entanglable;

public class Wig implements Entanglable {

    public Events entangle(Wig otherWig) {

        System.out.println("Парики чуть не спутались");
        return Events.TANGLED_WIGS;


    }

}