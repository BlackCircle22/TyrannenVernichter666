package autorennen;

public class Auto {

    private double tank;
    private double geschwindigkeit;
    private String nameA;
    private Rennstrecke onRenstrecke;
    private double spurRennstrecke;
    private double posRennstrecke;

    public Auto(String NameA, Rennstrecke onRennstrecke, double spurRennstrecke) {
    }

    public void beschleunigen() {
        System.out.println("lo");
        System.out.println("l2o");
           System.out.println("l44o");   
           System.out.println("l33o");
    }

    public void bremsen() {
    }

    public double getTank() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getGeschwindigkeit() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getPosRennstrecke() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double setPosRennstrecke(double posRennstrecke) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
