public enum Genders {

    MALE("мужчина"),
    FEMALE("женщина");

    private String gender;
    Genders(String gender) { this.gender = gender; }
    public String getGender() { return gender; }
}
