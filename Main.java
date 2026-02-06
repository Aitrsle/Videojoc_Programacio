package Videojoc_Programacio;

public class Main {
    public static void main(String[] args) {

        Guerrer g = new Guerrer("Guerrer", 1, 100, 50, Raresa.EPIC);
        Mag m = new Mag("Mag", 1, 80, 100, Raresa.LLEGENDARI);
        Monstre mon = new Monstre("Monstre", 1, 60, Raresa.COMU);

        System.out.println("INICI DEL COMBAT PER RONDES");

        
        System.out.println("TORN DEL GUERRER");
        g.atacar(mon);
        g.usarHabilitatEspecial(mon);
        mostrarEstat(g);
        mostrarEstat(mon);
        System.out.println("----------------------------------");

        
        System.out.println("TORN DEL MAG");
        m.atacar(g);
        mostrarEstat(m);
        mostrarEstat(g);
        System.out.println("----------------------------------");

        
        System.out.println("TORN DEL MONSTRE");
        mon.atacar(m);
        mostrarEstat(mon);
        mostrarEstat(m);
        System.out.println("----------------------------------");
    }

   
    public static void mostrarEstat(Entitat e) {
        System.out.print("ESTAT " + e.getNom() + "Vida: " + e.getPuntsVida() + " HP | Nivell: " + e.getNivell() + " | Raresa: " + e.getRaresa());
        
        //instanceof per mostrar atributs específics de cada classe , Buscat , no sabia com implementar-ho d'una altra manera
        if (e instanceof Mag) {
            System.out.print(" | Mana: " + ((Mag) e).getMana());
        } else if (e instanceof Guerrer) {
            System.out.print(" | Resistència: " + ((Guerrer) e).getResistencia());
        }
        System.out.println();
    }
}