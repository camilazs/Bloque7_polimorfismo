package personaaa;

public abstract class persona {
    private String nombre;
    private String apellidos;
    private String identificacion;
    private String estadoCivil;
    
    public persona(String nombre, String apellidos, String identificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.estadoCivil = estadoCivil;
    }
    
    public void cambiarEstadoCivil(String nuevoEstado) {
        this.estadoCivil = nuevoEstado;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
}

