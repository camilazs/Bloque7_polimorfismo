package paketeevehiculoss;

public class Camion extends Vehiculo {
    private Remolque remolque;

    public Camion(String matricula) {
        super(matricula);
        this.remolque = null; 
    }

    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    public void quitaRemolque() {
        this.remolque = null;
    }

    @Override
    public void acelerar(int kmh) {
        if (remolque != null && velocidad + kmh > 100) {
            System.out.println("¡Demasiado rápido con el remolque!");
        } else {
            super.acelerar(kmh);
        }
    }

    @Override
    public String toString() {
        return super.toString() + (remolque != null ? ", " + remolque.toString() : ", Sin remolque");
    }
}
