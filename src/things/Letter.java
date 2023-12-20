package things;

public class Letter {

    private String toWho;
    private String fromWho;
    private String theme;
    public Letter(String toWho, String fromWho, String theme) {

        this.toWho = toWho;
        this.fromWho = fromWho;
        this.theme = theme;

    }

    public String getToWho() { return toWho; }
    public String getFromWho() { return fromWho; }
    public String getTheme() { return theme; }

}
