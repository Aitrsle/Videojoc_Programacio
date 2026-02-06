package Videojoc_Programacio;

public enum Raresa {
    COMU(1.0), 
    RAR(1.2), 
    EPIC(1.5), 
    LLEGENDARI(2.0);

    private final double multiplicador;

    Raresa(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public double getMultiplicador() {
        return multiplicador;
    }
}