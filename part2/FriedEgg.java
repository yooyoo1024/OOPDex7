package part2;

public class FriedEgg implements Hamburger {

    Hamburger hamburger;

    public FriedEgg(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public String serve() {
        return hamburger.serve() + " with fried egg";
    }
}
