package autorennen;

public class Spielregeln {

    private int faktor;
    private String hindernis;

    public Spielregeln(){
        this.faktor = (int) (Math.random() *10) ;
        // max. bis 9, sonst keine konstante Geschwindigkeit moeglich
        switch (this.faktor) {
            case 0: this.hindernis = "Perfekt!";
                    break;
            case 1: this.hindernis = "Sonne-Hitze!";
                    break;
            case 2: this.hindernis = "Gegen-Wind!";
                    break;
            case 3: this.hindernis = "Regen!";
                    break;
            case 4: this.hindernis = "Sturm!";
                    break;
            case 5: this.hindernis = "Hagel!";
                    break;
            case 6: this.hindernis = "Orkan!";
                    break;
            case 7: this.hindernis = "Sandsturm!";
                    break;
            case 8: this.hindernis = "Tornado!";
                    break;
            default: this.hindernis = "Weltuntergang!";
                    break;
        }
    }
    public int getFaktor() {
        return this.faktor;
    }
    public String getHindernis() {
        return this.hindernis;
    }
 }
