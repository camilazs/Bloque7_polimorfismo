package piliempleo;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Empleado {
    private String coche;
    private List<String> clientes;

    public Vendedor(String nombre, String apellidos, String dni, String direccion, int antiguedad, String telefono, double salario, String coche) {
        super(nombre, apellidos, dni, direccion, antiguedad, telefono, salario);
        this.coche = coche;
        this.clientes = new ArrayList<>();
    }

    public void cambiarCoche(String nuevoCoche) {
        this.coche = nuevoCoche;
    }

    public void darAltaCliente(String cliente) {
        clientes.add(cliente);
    }

    public void darBajaCliente(String cliente) {
        clientes.remove(cliente);
    }

    @Override
    public void incrementarSalario(double porcentaje) {
        super.incrementarSalario(10); // Incrementa 10% anual
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Coche: " + coche);
        System.out.println("Clientes: " + clientes);
    }
}
