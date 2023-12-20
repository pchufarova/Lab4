package creatures;

import interfaces.Bowable;
import things.Wig;

public class Servant extends Creatures implements Bowable {

    protected String post;
    protected Wig wig;
    protected boolean isBowed = false;

    @Override
    public void bowTo(Servant servant) {

        System.out.println(post + " " + name + " поклонился " + servant.post + " " + servant.name);
        isBowed = true;

    }

    public boolean getIsBowed() {

        return isBowed;

    }

    public void setIsBowed(Boolean isBowed) {

        this.isBowed = isBowed;

    }

    public Wig getWig() {

        return wig;

    }

}
