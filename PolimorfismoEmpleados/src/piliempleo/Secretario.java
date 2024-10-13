package piliempleo;

public class Secretario extends Empleado {
    private String despacho;
    private String numFax;

    public Secretario(String nombre, String apellidos, String dni, String direccion, int antiguedad, String telefono, double salario, String despacho, String numFax) {
        super(nombre, apellidos, dni, direccion, antiguedad, telefono, salario);
        this.despacho = despacho;
        this.numFax = numFax;
    }

    @Override
    public void incrementarSalario(double porcentaje) {
        super.incrementarSalario(5); 
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Despacho: " + despacho);
        System.out.println("Número de Fax: " + numFax);
    }
}

