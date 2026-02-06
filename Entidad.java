package Videojoc_Programacio;
public abstract class Entidad {
    private String nombre;
    private int nivel;
    private int vida;

    public Entidad (String nombre, int nivel, int vida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
    }
    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre;
     }

    public int getNivel() { 
        return nivel; 
    }
    public void setNivel(int n) {
        if (n == this.nivel + 1) this.nivel = n;
        else System.out.println("ACCÉS DENEGAT");
    }

    public int getVida() {
         return vida;
         }
    public void setVida(int v) {
        if (v < 0) this.vida = 0;
        else this.vida = v;
    }

    public void rebreDany(int quantitat) {
        setVida(this.vida - quantitat);
    }

    public abstract void Atacar();
}