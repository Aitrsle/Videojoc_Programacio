package Videojoc_Programacio;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Entidad> lista = new ArrayList<>();

        Guerrero guerrero = new Guerrero();
        guerrero.setNombre("Guerrero");
        guerrero.setVida(100);
        guerrero.setNivel(1);
        guerrero.setResistencia(5);

        Mago mago = new Mago();
        mago.setNombre("Mago");
        mago.setVida(80);
        mago.setNivel(1);
        mago.setMana(50);

        Monstruo monstruo = new Monstruo();
        monstruo.setNombre("Monstruo");
        monstruo.setVida(50);
        monstruo.setNivel(1);

        lista.add(guerrero);
        lista.add(mago);
        lista.add(monstruo);
        
        for (Entidad e : lista) {
            e.Atacar();
        }

    }
}