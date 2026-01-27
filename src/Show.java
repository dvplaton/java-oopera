import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printDirectorInfo() {
        System.out.println(director.toString());
    }

    public void printListOfActors() {
        System.out.println("---" + title + "---");
        System.out.println("В ролях:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
        System.out.println("---");
        System.out.println("Режиссёр постановщик:");
        printDirectorInfo();
        System.out.println("---");
    }

    public void addNewActor(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println(newActor + " уже задействован в этом спектакле!");
                return;
            }
        }
        listOfActors.add(newActor);
        System.out.println(newActor.surname + " будет играть в " + title);
    }

    public void changeActor(Actor newActor, String dismissedSurname) {
        for (Actor actor : listOfActors) {
            if (actor.surname.equals(dismissedSurname)) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                System.out.println(newActor.surname + " заменяет " + actor.surname);
                return;
            }
        }
        System.out.println(dismissedSurname + " не задействован в " + title);
    }
}
