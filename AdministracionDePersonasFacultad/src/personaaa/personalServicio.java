package personaaa;

public class personalServicio extends empleado {
    private String seccion;
    
    public personalServicio(String nombre, String apellidos, String identificacion, String estadoCivil, int añoIncorporacion, int numeroDespacho, String seccion) {
        super(nombre, apellidos, identificacion, estadoCivil, añoIncorporacion, numeroDespacho);
        this.seccion = seccion;
    }
    
    public void trasladarSeccion(String nuevaSeccion) {
        this.seccion = nuevaSeccion;
    }

    
    public String getSeccion() {
        return seccion;
    }
}
