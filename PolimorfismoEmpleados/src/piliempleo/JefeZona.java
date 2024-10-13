package piliempleo;

import java.util.ArrayList;
import java.util.List;

public class JefeZona extends Empleado {
    private Secretario secretario;
    private List<Vendedor> listaVendedores;
    private String coche;

    public JefeZona(String nombre, String apellidos, String dni, String direccion, int antiguedad, String telefono, double salario, String coche) {
        super(nombre, apellidos, dni, direccion, antiguedad, telefono, salario);
        this.coche = coche;
        this.listaVendedores = new ArrayList<>();
    }

    public void cambiarSecretario(Secretario nuevoSecretario) {
        this.secretario = nuevoSecretario;
    }

    public void cambiarCoche(String nuevoCoche) {
        this.coche = nuevoCoche;
    }

    public void darAltaVendedor(Vendedor vendedor) {
        listaVendedores.add(vendedor);
    }

    public void darBajaVendedor(Vendedor vendedor) {
        listaVendedores.remove(vendedor);
    }

    @Override
    public void incrementarSalario(double porcentaje) {
        super.incrementarSalario(20); 
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Coche: " + coche);
        System.out.println("Secretario: " + (secretario != null ? secretario.nombre : "Ninguno"));
        System.out.println("Vendedores: " + listaVendedores.size());
    }
}
