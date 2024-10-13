package gestor;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Seleccione una figura para calcular:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectángulo");
            System.out.println("4. Triángulo");
            System.out.println("5. Cubo");
            System.out.println("0. Salir");
            
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el radio del círculo:");
                    Figura circulo = new circuloo();
                    circulo.establecerDimensionPrincipal(entrada.nextInt());
                    System.out.println("Área del círculo: " + circulo.calcularArea());
                    System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
                    break;
                    
                case 2:
                    System.out.println("Ingrese el lado del cuadrado:");
                    Figura cuadrado = new cuadrado();
                    cuadrado.establecerDimensionPrincipal(entrada.nextInt());
                    System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
                    System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());
                    break;
                    
                case 3:
                    System.out.println("Ingrese el largo del rectángulo:");
                    rectangulo rectangulo = new rectangulo();
                    rectangulo.establecerDimensionPrincipal(entrada.nextInt());
                    System.out.println("Ingrese el ancho del rectángulo:");
                    rectangulo.establecerDimensionSecundaria(entrada.nextInt());
                    System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
                    System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
                    break;
                    
                case 4:
                    System.out.println("Ingrese la base del triángulo:");
                    triangulo triangulo = new triangulo();
                    triangulo.establecerDimensionPrincipal(entrada.nextInt());
                    System.out.println("Ingrese la altura del triángulo:");
                    triangulo.establecerDimensionSecundaria(entrada.nextInt());
                    System.out.println("Área del triángulo: " + triangulo.calcularArea());
                    System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
                    break;
                    
                case 5:
                    System.out.println("Ingrese el lado del cubo:");
                    Figura cubo = new cubo();
                    cubo.establecerDimensionPrincipal(entrada.nextInt());
                    System.out.println("Área del cubo: " + cubo.calcularArea());
                    try {
                        System.out.println("Perímetro del cubo: " + cubo.calcularPerimetro());
                    } catch (UnsupportedOperationException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                    
                case 0:
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
        
        entrada.close();
    }
}
