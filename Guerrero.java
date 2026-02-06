package Videojoc_Programacio;
public class Guerrero extends Entidad {
    private int resistencia;
    private int daño;

    public int getResistencia() {
        return resistencia;
    }
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getDaño() {
        return daño;
    }
    public void setDaño(int daño) {
        this.daño = daño;
    }

    @Override
    public void Atacar() {
        setDaño(2);
        System.out.println(getNombre() + " ataca físicament // Dany: " + getDaño());
    }

    @Override
    public void rebreDany(int quantitat) {
        int danyFinal = quantitat - resistencia;
        if (danyFinal < 0) danyFinal = 0;
        setVida(getVida() - danyFinal);
    }
}