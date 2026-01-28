import java.util.Objects;

public class Actor extends Person {
    protected int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + height + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Actor newActor = (Actor) obj;
        return Objects.equals(name, newActor.name) &&
                Objects.equals(surname, newActor.surname) &&
                (height == newActor.height);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (name != null) {
            hash = hash + name.hashCode();
        }
        hash = hash * 31;
        if (surname != null) {
            hash = hash + surname.hashCode();
        }
        hash = hash + height;
        return hash; // возвращаем итоговый хеш
    }
}
