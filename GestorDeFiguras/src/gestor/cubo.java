package gestor;

class cubo extends Figura {
    @Override
    public double calcularArea() {
        return 6 * dimensionPrincipal * dimensionPrincipal;
    }
    
    @Override
    public double calcularPerimetro() {
        throw new UnsupportedOperationException("Un cubo no tiene perímetro.");
    }
}

