public class Dwarves{
    private int vida;
    private String nome;
    public Dwarves(String nome){
        this.vida = 110;
        this.nome = nome;
    }
    public void perdeVida(){
        this.vida -= 10;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
   
}
