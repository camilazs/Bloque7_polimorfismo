package paketeevehiculoss;

public class Main {
    public static void main(String[] args) {
        
        Coche coche = new Coche("VUS123", 4);
        System.out.println(coche.toString()); 
        coche.acelerar(50);
        System.out.println(coche.toString());  

        
        Camion camion = new Camion("KKE023");
        System.out.println(camion.toString());  
        camion.acelerar(90);
        System.out.println(camion.toString());  

        
        Remolque remolque = new Remolque(2000);
        camion.ponRemolque(remolque);
        System.out.println(camion.toString());  

        
        camion.acelerar(20);
        System.out.println(camion.toString());  
    }
}

