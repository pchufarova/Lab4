package enums;

public enum Reactions {

    IGNORE("не обращает внимания"),
    CRY("вопит"),
    FEAR("испуг"),
    CALM("спокойствие"),
    CURIOUS("интересно"),
    LAUGHING("смеётся"),
    ANNOYED("раздражение"),
    DETERMINATION("решительность"),
    SMILING("улыбается"),
    JOY("восторг"),
    SNEEZE("чихает");


    private String condition;
    Reactions(String condition) { this.condition = condition; }
    public String getCondition() { return condition; }

}
