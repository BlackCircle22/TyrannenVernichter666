package autorennen;

public class Spielregeln {

    private double faktor;
    private String hindernis;

    public void regen() {
        this.faktor = 0.75;
        this.hindernis = "Regen";
    }
    public void gegenwind() {
        this.faktor = 0.9;
        this.hindernis = "Gegenwind";
    }
    public double getFaktor() {
        return this.faktor;
    }
    public String getHindernis() {
        return this.hindernis;
    }
    public void setZufallHindernis() {
        this.faktor = Math.random();
        if (this.faktor > 0.89) {
            this.hindernis = "Wind";
        } else {
            this.hindernis = "Regen";
        }
    }
 }
