package Videojoc_Programacio;
public class Monstruo extends Entidad {
    private int daño;

    public int getDaño() {
        return daño;
    }
    public void setDaño(int daño) {
        this.daño = daño;
    }

    @Override
    public void Atacar() {
        setDaño(3);
        System.out.println(getNombre() + " ataca salvatge // Dany: " + getDaño());
    }
}