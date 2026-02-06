package Videojoc_Programacio;

public class Monstruo extends Entidad {

    private int daño;

    public Monstruo(String nombre, int nivel, int vida) {
        super(nombre, nivel, vida);
    }

    public int getDaño() {
        return daño;
    }

    @Override
    public void atacar() {
        daño = 3;
        System.out.println(getNombre() + " Ataca de forma salvaje // Danyo: " + daño);
    }

    // CARTA 
    public void rugido() {
        System.out.println(getNombre() + " Hace Rugido!");
    }
}
