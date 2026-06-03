package part2;

public class HamburgerFactory {

    /* code:
        cl: classic
        sp: spicy
        la: lamb
        hm: homemade
    */
    public static Hamburger createHamburger(String code) {
        Hamburger hamburger;
        switch (code) {
            case "cl":
                hamburger = new ClassicHamburger();
                break;
            case "sp":
                hamburger = new SpicyHamburger();
                break;
            case "la":
                hamburger = new LambHamburger();
                break;
            case "hm":
                hamburger = new HomemadeHamburger();
                break;
            default:
                throw new RuntimeException("wrong Hamburger");
        }
        return hamburger;
    }
}
