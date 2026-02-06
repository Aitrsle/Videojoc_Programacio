package Videojoc_Programacio;

public class Mago extends Entidad {

    private int mana;
    private int daño;

    public Mago(String nombre, int nivel, int vida, int mana) {
        super(nombre, nivel, vida);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) this.mana = 0;
        else this.mana = mana;
    }

    public int getDaño() {
        return daño;
    }

    @Override
    public void atacar() {
        if (mana > 0) {
            daño = 1;
            mana--;
            System.out.println(getNombre() + " Lanza encantamiento // Danyo: " + daño);
        } else {
            System.out.println(getNombre() + " No tiene mana!");
        }
    }

    // CARTA ESPECIAL
    public void bolaDeFoc() {
        if (mana >= 3) {
            mana -= 3;
            System.out.println(getNombre() + " Lanza BOLA DE FUEGO!");
        } else {
            System.out.println(getNombre() + " No tiene mana suficiente!");
        }
    }
}
