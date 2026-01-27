public class MusicalShow extends Show {
    protected final Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title,
                       int duration,
                       Director director,
                       Person musicAuthor,
                       String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }

    @Override
    public void printListOfActors() {
        super.printListOfActors();
        System.out.println("Композитор: " + musicAuthor.name + " " + musicAuthor.surname);
        System.out.println("---");
    }
}
