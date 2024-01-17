package enums;

import surroundings.Place;

public enum Events {

    SERVANTS_IN_WIGS,
    TANGLED_WIGS,
    CRUCIAN_GOES_AWAY,
    DOOR_IS_KNOCKED;

    private Place bush = new Place("Куст");
    public Place getBush() { return bush; }

}
