package interfaces;

import enums.Places;
import surroundings.Home;

public interface Goable {

    void goTo(Places place);
    void goTo(Home home);
    void goTo(Home.Kitchen kitchen);

}
