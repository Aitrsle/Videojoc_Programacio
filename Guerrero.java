package Videojoc_Programacio;

public class Guerrero extends Entidad {
    private int resistencia;
    private int daño;

    public Guerrero(String nombre, int nivel, int vida, int resistencia) {
        super(nombre, nivel, vida);
        this.resistencia = resistencia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getDaño() {
        return daño;
    }

    @Override
    public void atacar() {
        daño = 2;
        System.out.println(getNombre() + " ataca con fuerza física // Danyo: " + daño);
    }

    @Override
    public void rebreDany(int quantitat) {
        int danyFinal = quantitat - resistencia;
        if (danyFinal < 0) danyFinal = 0;
        setVida(getVida() - danyFinal);
    }

    // CARTA 
    public void copEscut() {
        System.out.println(getNombre() + " usa Golpe de Escudo!");
    }
}
