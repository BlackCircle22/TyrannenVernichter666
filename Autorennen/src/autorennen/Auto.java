package autorennen;

public class Auto {

    private double tank;
    private int geschwindigkeit;
    private String nameA;
    private Rennstrecke onRenstrecke;
    private double spurRennstrecke;
    private double posRennstrecke;

  
    
    public Auto(String NameA, Rennstrecke onRennstrecke, double spurRennstrecke) {
    }

    public int beschleunigen(int beschleunigung) {
        this.geschwindigkeit = geschwindigkeit + beschleunigung;
        return this.geschwindigkeit;
        
    }

    public int bremsen(int abbremsen) {
        
        if (this.geschwindigkeit <=0){
            this.geschwindigkeit = geschwindigkeit - abbremsen;
        return this.geschwindigkeit;
        }
        return this.geschwindigkeit;
    }

    public double getTank() {
        
        
        
        this.tank = tank;
        
        
        
        return tank;
        
        
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
