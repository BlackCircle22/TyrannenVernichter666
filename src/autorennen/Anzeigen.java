package autorennen;

public class Anzeigen {

    public void tankAnzeigen(Auto auto) {
         
  
        double nTank = auto.getTank() ;
        int a=1;
        switch(1) {
                case 1:  nTank = 100;
                         break;
                case 2:  nTank = 75;
                         break;
                case 3:  nTank = 50;
                         break;
                case 4:  nTank = 50;
                         break;
                case 5:  nTank = 25;
                         break;
                default: break;
        }

    }
    
    public void geschwindigkeitAnzeigen(Auto auto) {
    }

    public void posAnzeigen(Auto auto) {
    }
}
