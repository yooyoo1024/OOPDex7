package part2;

public class TopingsFactory {

    public static Hamburger createHamburgerWithTopings(
        Hamburger hamburger,
        String code
    ) {
        Hamburger result;
        switch (code) {
            case "ch":
                result = new Chips(hamburger);
                break;
            case "or":
                result = new OnionRings(hamburger);
                break;
            case "sa":
                result = new Salad(hamburger);
                break;
            case "fe":
                result = new FriedEgg(hamburger);
                break;
            default:
                throw new RuntimeException("wrong Toping");
        }
        return result;
    }
}
