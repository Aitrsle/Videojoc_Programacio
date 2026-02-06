package Videojoc_Programacio;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Entidad> llista = new ArrayList<>();

        Guerrero g = new Guerrero("Guerrero", 1, 100, 5);
        Mago m = new Mago("Mago", 1, 80, 10);
        Monstruo mo = new Monstruo("Monstruo", 1, 60);

        llista.add(g); // Carta 1 
        llista.add(m); // Carta 2   
        llista.add(mo); // Carta 3


        for (Entidad e : llista) {
            e.atacar();
        }

        System.out.println("PRUEBA DE ENCAPSULAMIENTO:");

        g.setNivel(10); 
        g.setVida(-500);  

        System.out.println(g.getNombre() + " Vida actual: " + g.getVida());

        g.copEscut();
        m.bolaDeFoc();
        mo.rugido();
    }
}
