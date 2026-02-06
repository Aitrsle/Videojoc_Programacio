package Videojoc_Programacio;

public class Monstre extends Entitat {
    public Monstre(String nom, int nivell, int puntsVida, Raresa raresa) {
        super(nom, nivell, puntsVida, raresa);
    }

    @Override
    public void atacar(Entitat objectiu) {
        int danyFinal = (int) (15 * getRaresa().getMultiplicador());
        System.out.println(getNom() + " fa un atac salvatge fent " + danyFinal + " de dany");
        objectiu.rebreDany(danyFinal);
        System.out.println("S'activa carta: Tren Malalt (-5 HP)");
        this.rebreDany(5);
    }
}