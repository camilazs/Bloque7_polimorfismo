package gestor;

class circuloo extends Figura {
    private static final double PI = 3.1416;
    
    @Override
    public double calcularArea() {
        return PI * dimensionPrincipal * dimensionPrincipal;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * PI * dimensionPrincipal;
    }
}

