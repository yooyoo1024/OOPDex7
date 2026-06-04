package part2;

public class Salad implements Hamburger {

    Hamburger hamburger;

    public Salad(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public String serve() {
        return hamburger.serve() + " with salad";
    }
}
