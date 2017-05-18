package autorennen;

public class Spielregeln {

    private double faktor;

    public void regen() {
        this.faktor = 2;
    }

    public void gegenwind() {
        this.faktor = 1.5;
    }

    public double getFaktor() {
        return this.faktor;
    }
}
