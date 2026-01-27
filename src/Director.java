public class Director extends Person {
    int numberOfShows;

    public Director(String name, String surname, Gender gender, int height, int numberOfShows) {
        super(name, surname, gender, height);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return name.toUpperCase() + " " + surname.toUpperCase();
    }
}
