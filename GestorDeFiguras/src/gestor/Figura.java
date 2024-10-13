package gestor;

abstract class Figura {
    protected int dimensionPrincipal;
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    public int obtenerDimensionPrincipal() {
        return dimensionPrincipal;
    }
    
    public void establecerDimensionPrincipal(int dimensionPrincipal) {
        this.dimensionPrincipal = dimensionPrincipal;
    }
}
