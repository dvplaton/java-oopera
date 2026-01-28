import java.util.ArrayList;
import java.util.Scanner;

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
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
        printDirectorInfo();
    }

    public void addNewActor(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println(newActor + " уже задействован в этом спектакле!");
                return;
            }
        }
        listOfActors.add(newActor);
        System.out.println(newActor + " будет играть в " + title);
    }

    public void changeActor(Actor newActor, String dismissedSurname) {
        int aCount = 0;
        int aIndex = 0;
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(dismissedSurname)) {
                aIndex = listOfActors.indexOf(actor);
                aCount++;
            }
        }
        if (aCount < 1) {
            System.out.println(dismissedSurname + " не задействован в " + title);
        } else if (aCount == 1) {
            System.out.println(newActor.getSurname() + " заменяет " + listOfActors.get(aIndex));
            listOfActors.remove(aIndex);
            listOfActors.add(newActor);
        } else {
            System.out.println("Которого уволить?");
            for (Actor actor : listOfActors) {
                if (actor.getSurname().equals(dismissedSurname)) {
                    System.out.println("Чтобы уволить [ " + actor + " ] нажмите " + listOfActors.indexOf(actor));
                }
            }
            Scanner scanner = new Scanner(System.in);
            aIndex = scanner.nextInt();
            System.out.println(newActor.getSurname() + " заменяет " + listOfActors.get(aIndex));
            listOfActors.remove(aIndex);
            listOfActors.add(newActor);
            scanner.close();
        }
    }
}
