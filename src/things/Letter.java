package things;

public class Letter {

    private final String toWho;
    private final String fromWho;
    private final String theme;
    public Letter(String toWho, String fromWho, String theme) {

        this.toWho = toWho;
        this.fromWho = fromWho;
        this.theme = theme;

    }

    public String getToWho() { return toWho; }
    public String getFromWho() { return fromWho; }
    public String getTheme() { return theme; }

}
