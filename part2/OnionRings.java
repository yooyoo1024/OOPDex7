package part2;

public class OnionRings implements Hamburger {
    Hamburger hamburger;
    
    public OnionRings(Hamburger hamburger) {
        this.hamburger = hamburger;
    }
    
    @Override
    public String serve() {
        return hamburger.serve() + " with onion rings";
    }
}
