public class Elfo{
    private String nome;
    private int flechas;
    private int experiencia = 0;
    public Elfo(String nome){
        this.nome = nome;
        this.flechas = 42;
    }
    public Elfo(String nome, int flechas){
        this.nome = nome;
        this.flechas = flechas;
    }
    public void atirarFlecha(Dwarves dwarf){
        this.flechas--;
        this.experiencia++;   
        dwarf.perdeVida();
    }
    public String getNome(){
        return this.nome;
    }
}
