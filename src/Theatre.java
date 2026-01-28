public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Ivan", "Petrov", Gender.MALE, 176);
        Actor actor2 = new Actor("Petr", "Petrov", Gender.MALE, 178);
        Actor actor3 = new Actor("Sidor", "Sidorov", Gender.MALE, 193);

        Director director1 = new Director("Gai", "Richi", Gender.MALE, 50);
        Director director2 = new Director("Sofia", "Coppola", Gender.FEMALE, 7);

        Person compositor1 = new Person("Dmitriy", "Shostakovich", Gender.MALE);
        Person choreographer1 = new Person("Maya", "Pliseckaya", Gender.FEMALE);

        Show show1 = new Show("Gamlet", 120, director1);
        Opera opera1 = new Opera("Traviata", 180, director2, compositor1, "lorem ipsum OPERA", 12);
        Ballet ballet1 = new Ballet("Spartak", 240, director1, compositor1, "lorem ipsum BALLET", choreographer1);

        show1.addNewActor(actor1);
        show1.addNewActor(actor2);
        show1.addNewActor(actor3);
        opera1.addNewActor(actor1);
        opera1.addNewActor(actor2);
        ballet1.addNewActor(actor3);
        ballet1.addNewActor(actor3); // не ошибка, а проверка.

        show1.printListOfActors();
        opera1.printListOfActors();
        ballet1.printListOfActors();

        opera1.changeActor(actor3, "Petrov");
        opera1.printListOfActors();

        show1.changeActor(actor3, "Stethem");

        opera1.printLibrettoText();
        ballet1.printLibrettoText();
    }
}
