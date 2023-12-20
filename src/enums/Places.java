package enums;

public enum Places {

    BUSH("Куст"),
    FOREST("Лес");

    private String name;
    Places(String name) { this.name = name; }
    public String getName() { return name; }

}
