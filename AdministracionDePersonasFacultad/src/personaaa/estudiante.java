package personaaa;

public class estudiante extends persona {
    private String curso;
    
    public estudiante(String nombre, String apellidos, String identificacion, String estadoCivil, String curso) {
        super(nombre, apellidos, identificacion, estadoCivil);
        this.curso = curso;
    }
    
    public void matricularCurso(String nuevoCurso) {
        this.curso = nuevoCurso;
    }

    // Getters y Setters
    public String getCurso() {
        return curso;
    }
}

