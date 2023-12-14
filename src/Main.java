public class Main {

    public static void main(String[] args) {

        GrillThings poker = new GrillThings("Кочерга");
        GrillThings scoop = new GrillThings("Совок");
        Tableware tongs = new Tableware("Щипцы для угля");
        Tableware cups = new Tableware("Чашки");
        Tableware plates = new Tableware("Тарелки");
        Tableware pans = new Tableware("Сковородки");
        Duchess duchess = new Duchess("Герцогиня");
        Child child = new Child("Ребёночек", Genders.MALE);
        Girl girl = new Girl("Алиса");

        Things[] arrayOfThings = new Things[] {poker, scoop, tongs, pans, plates, cups};

        for (Things thing: arrayOfThings) {

            thing.flyInto(duchess, child, girl);
            System.out.print("\n");

        }

    }

}