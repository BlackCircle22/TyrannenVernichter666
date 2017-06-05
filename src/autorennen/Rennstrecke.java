package autorennen;

public class Rennstrecke {

    private int laenge;
    private String nameR;
    private int rundenZaehler;
    

    public Rennstrecke(int laenge, String nameR) {
        this.laenge = laenge;
        this.nameR = nameR;
        this.rundenZaehler = 0;
    }
    public String getLaenge(){
        return Integer.toString(this.laenge);
    }
    public String getRunde(){
        return Integer.toString(this.rundenZaehler);
    }
    public int getRundeI(){
        return this.rundenZaehler;
    }
    public void setRunde(int rundenZaehler){
        this.rundenZaehler = rundenZaehler;
    }
    public String getNameR(){
        return this.nameR;
    }

}
