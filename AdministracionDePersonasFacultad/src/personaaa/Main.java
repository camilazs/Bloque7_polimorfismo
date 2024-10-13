package personaaa;

public class Main {
    public static void main(String[] args) {
        
        estudiante estudiante = new estudiante("Carlos", "Perez", "123456", "Soltero", "Ingeniería");
        profesor profesor = new profesor("Ana", "Gomez", "654321", "Casada", 2010, 101, "Matemáticas");
        personalServicio personal = new personalServicio("Luis", "Martinez", "112233", "Divorciado", 2015, 202, "Biblioteca");
        
        
        System.out.println("Estudiante: " + estudiante.getNombre() + " " + estudiante.getApellidos() + ", Curso: " + estudiante.getCurso());
        System.out.println("Profesor: " + profesor.getNombre() + " " + profesor.getApellidos() + ", Departamento: " + profesor.getDepartamento());
        System.out.println("Personal de Servicio: " + personal.getNombre() + " " + personal.getApellidos() + ", Sección: " + personal.getSeccion());
        
        
        estudiante.matricularCurso("Arquitectura");
        profesor.cambiarDepartamento("Física");
        personal.trasladarSeccion("Decanato");
        
        
        System.out.println("\nInformación actualizada:");
        System.out.println("Estudiante: " + estudiante.getNombre() + " " + estudiante.getApellidos() + ", Curso: " + estudiante.getCurso());
        System.out.println("Profesor: " + profesor.getNombre() + " " + profesor.getApellidos() + ", Departamento: " + profesor.getDepartamento());
        System.out.println("Personal de Servicio: " + personal.getNombre() + " " + personal.getApellidos() + ", Sección: " + personal.getSeccion());
    }
}

