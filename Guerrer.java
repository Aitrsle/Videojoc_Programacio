package Videojoc_Programacio;

public class Guerrer extends Entitat implements HabilitatEspecial {
    private int resistencia;

    public Guerrer(String nom, int nivell, int puntsVida, int resistencia, Raresa raresa) {
        super(nom, nivell, puntsVida, raresa);
        this.resistencia = resistencia;
    }

    public int getResistencia() {
         return resistencia;
         }

    @Override
    public void atacar(Entitat objectiu) {
        int danyFinal = (int) (20 * getRaresa().getMultiplicador());
        System.out.println(getNom() + " ataca físicament fent " + danyFinal + " de dany!");
        objectiu.rebreDany(danyFinal);
        System.out.println("S'activa carta: Tren Malalt (-5 HP)");
        this.rebreDany(5); 
    }

    @Override
    public void rebreDany(int quantitat) {
        int danyFinal = Math.max(0, quantitat - (resistencia / 10));
        super.rebreDany(danyFinal);
    }

    @Override
    public void usarHabilitatEspecial(Entitat objectiu) {
        System.out.println(getNom() + " utilitza COP ESCUT!");
        objectiu.rebreDany(30);
    }
}