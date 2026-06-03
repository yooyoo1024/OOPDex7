package part2;

public class Chips implements Hamburger {
    Hamburger hamburger;
    
    public Chips(Hamburger hamburger) {
        this.hamburger = hamburger;
    }
    
    @Override
    public String serve() {
        return hamburger.serve() + " with chips";
    }
}
