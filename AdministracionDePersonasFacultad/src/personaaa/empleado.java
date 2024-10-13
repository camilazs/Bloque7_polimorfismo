package personaaa;

public abstract class empleado extends persona {
    private int añoIncorporacion;
    private int numeroDespacho;
    
    public empleado(String nombre, String apellidos, String identificacion, String estadoCivil, int añoIncorporacion, int numeroDespacho) {
        super(nombre, apellidos, identificacion, estadoCivil);
        this.añoIncorporacion = añoIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }
    
    public void reasignarDespacho(int nuevoDespacho) {
        this.numeroDespacho = nuevoDespacho;
    }

    // Getters y Setters
    public int getAñoIncorporacion() {
        return añoIncorporacion;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }
}

