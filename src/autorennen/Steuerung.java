package autorennen;

public class Steuerung {

    public void gasGeben(Auto auto) {
        auto.beschleunigen() ;
    }

    public void bremsen(Auto auto) {
        auto.bremsen();
    }

    public void handicap(Auto auto) {
        System.out.println("geht noch nicht ..");
    }
}
