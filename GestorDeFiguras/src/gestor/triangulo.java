package gestor;

class triangulo extends Figura {
    protected int dimensionSecundaria;
    
    @Override
    public double calcularArea() {
        return (dimensionPrincipal * dimensionSecundaria) / 2.0;
    }
    
    @Override
    public double calcularPerimetro() {
        return 3 * dimensionPrincipal;
    }
    
    public int obtenerDimensionSecundaria() {
        return dimensionSecundaria;
    }
    
    public void establecerDimensionSecundaria(int dimensionSecundaria) {
        this.dimensionSecundaria = dimensionSecundaria;
    }
}

