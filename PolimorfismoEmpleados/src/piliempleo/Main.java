package piliempleo;

public class Main {
    public static void main(String[] args) {
        
        Secretario secretario = new Secretario("Laura", "Gómez", "12345678X", "Calle Falsa 23", 5, "555-1234", 1500, "A101", "987654321");
        Vendedor vendedor = new Vendedor("Carlos", "Pérez", "87654321Y", "Avenida Siempreviva", 3, "555-9876", 1200, "Ford Fiesta");
        JefeZona jefeZona = new JefeZona("Ana", "Martínez", "11223344Z", "Calle Luna", 10, "555-0000", 2500, "BMW X5");
        
        jefeZona.cambiarSecretario(secretario);
        jefeZona.darAltaVendedor(vendedor);

        
        secretario.imprimir();
        System.out.println("---------------");
        vendedor.imprimir();
        System.out.println("---------------");
        jefeZona.imprimir();

        
        secretario.incrementarSalario(5); 
        vendedor.incrementarSalario(10);  
        jefeZona.incrementarSalario(20);  

        
        System.out.println("\nDespués del incremento salarial:");
        secretario.imprimir();
        System.out.println("---------------");
        vendedor.imprimir();
        System.out.println("---------------");
        jefeZona.imprimir();
    }
}
