package Videojoc_Programacio;

import java.util.ArrayList;

public abstract class Entitat {
    private String nom;
    private int nivell;
    private int puntsVida;
    private ArrayList<String> cartes; 
    private Raresa raresa;

    public Entitat(String nom, int nivell, int puntsVida, Raresa raresa) {
        this.nom = nom;
        this.nivell = nivell;
        this.raresa = raresa;
        setPuntsVida(puntsVida);
        this.cartes = new ArrayList<>();
        this.cartes.add("Atac del tren malalt"); 
    }

    public String getNom() { 
        return nom; 
    }
    public int getNivell() { 
        return nivell; 
    }
    public int getPuntsVida() { 
        return puntsVida; 
    }
    public ArrayList<String> getCartes() { 
        return cartes; 
    }
    public Raresa getRaresa() { 
        return raresa; 
    }

    public void setPuntsVida(int v) {
        if (v < 0) {
            this.puntsVida = 0;
        } else {
            this.puntsVida = v;
        }
    }

    public void setNivell(int n) {
        if (n == this.nivell + 1) {
            this.nivell = n;
        } else {
            System.out.println("Intent de modificació de nivell invàlid per a " + nom);
        }
    }

    public void rebreDany(int quantitat) {
        this.setPuntsVida(this.puntsVida - quantitat);
    }

    public void afegirCarta(String nomCarta) {
        if (this.cartes.size() < 10) {
            this.cartes.add(nomCarta);
        }
    }

    public abstract void atacar(Entitat objectiu);
}