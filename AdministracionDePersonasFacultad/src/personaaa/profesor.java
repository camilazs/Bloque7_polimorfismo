package personaaa;

public class profesor extends empleado {
    private String departamento;
    
    public profesor(String nombre, String apellidos, String identificacion, String estadoCivil, int añoIncorporacion, int numeroDespacho, String departamento) {
        super(nombre, apellidos, identificacion, estadoCivil, añoIncorporacion, numeroDespacho);
        this.departamento = departamento;
    }
    
    public void cambiarDepartamento(String nuevoDept) {
        this.departamento = nuevoDept;
    }

    // Getters y Setters
    public String getDepartamento() {
        return departamento;
    }
}

