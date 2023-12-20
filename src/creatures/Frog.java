package creatures;

import enums.Positions;
import things.Wig;

public class Frog extends Servant {

    public Frog() {

        name = "Головастик";
        post = "Швейцар";
        Wig wig = new Wig();
        Positions position = Positions.STRAIGHT;

    }

}
