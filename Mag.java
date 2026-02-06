package Videojoc_Programacio;

public class Mag extends Entitat {
    private int mana;

    public Mag(String nom, int nivell, int puntsVida, int mana, Raresa raresa) {
        super(nom, nivell, puntsVida, raresa);
        this.mana = mana;
    }

    public int getMana() { return mana; }
    public void gastarMana(int quantitat) { this.mana -= quantitat; }

    @Override
    public void atacar(Entitat objectiu) {
        int danyFinal = (int) (25 * getRaresa().getMultiplicador());
        System.out.println(getNom() + " llança un encanteri fent " + danyFinal + " de dany!");
        objectiu.rebreDany(danyFinal);
        gastarMana(15);
        System.out.println("S'activa carta: Tren Malalt (-5 HP)");
        this.rebreDany(5);
    }
}