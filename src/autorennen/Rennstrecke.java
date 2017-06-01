package autorennen;

public class Rennstrecke {

    private double laenge;
    private String nameR;
    private Auto spur1;
    private Auto spur2;

    public Rennstrecke(double laenge, String nameR) {
        this.laenge = laenge;
        this.nameR = nameR;
    }
    public void setSpur1(Auto auto){
        this.spur1 = auto;
    }
    public void setSpur2(Auto auto){
        this.spur2 = auto;
    }
    public double getLaenge(){
        return this.laenge;
    }
    public String getNameR(){
        return this.nameR;
    }
    public Auto getSpur1(){
        return this.spur1;
    }
    public Auto getSpur2(){
        return this.spur2;
    }

}
