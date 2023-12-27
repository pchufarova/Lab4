package enums;

public enum Reactions {

    IGNORE("не обращает внимания"),
    CRY("вопит"),
    FEAR("вне себя от ужаса"),
    CALM("спокойствие"),
    CURIOUS("интересно"),
    LAUGHING("смеётся"),
    ANNOYED("раздражение"),
    DETERMINATION("решительность");

    private String condition;
    Reactions(String condition) { this.condition = condition; }
    public String getCondition() { return condition; }

}
