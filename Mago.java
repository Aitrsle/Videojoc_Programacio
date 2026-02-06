package Videojoc_Programacio;
public class Mago extends Entidad {
    private int mana;
    private int daño;

    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getDaño() {
        return daño;
    }
    public void setDaño(int daño) {
        this.daño = daño;
    }

    @Override
    public void Atacar() {
        setDaño(1);
        setMana(getMana() - 1);
        System.out.println(getNombre() + " llança magia // Dany: " + getDaño());
    }
}