public class Elfo extends Personagem{
    protected int flechas;
    public Elfo(String nome){
        super(nome);
        this.flechas = 42;
        this.vida = 100;
    }
    public Elfo(String nome, int flechas){
        this(nome);
        this.flechas = flechas;
    }
    public void atirarFlecha(Dwarves dwarf){
        this.flechas--;
        this.experiencia++;  
        dwarf.perdeVida();
    }
    public int getFlechas(){
        return this.flechas;
    }
    public String toString(){
        return (nome + " possui " + flechas + " flechas e " + experiencia + " de experiencia." );
    }
}
