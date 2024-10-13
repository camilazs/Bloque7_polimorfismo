package gestor;

class rectangulo extends Figura {
    protected int dimensionSecundaria;
    
    @Override
    public double calcularArea() {
        return dimensionPrincipal * dimensionSecundaria;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * (dimensionPrincipal + dimensionSecundaria);
    }
    
    public int obtenerDimensionSecundaria() {
        return dimensionSecundaria;
    }
    
    public void establecerDimensionSecundaria(int dimensionSecundaria) {
        this.dimensionSecundaria = dimensionSecundaria;
    }
}

