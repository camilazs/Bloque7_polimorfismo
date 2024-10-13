package gestor;

class cuadrado extends Figura {
    @Override
    public double calcularArea() {
        return dimensionPrincipal * dimensionPrincipal;
    }
    
    @Override
    public double calcularPerimetro() {
        return 4 * dimensionPrincipal;
    }
}
