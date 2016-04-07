public class Dwarves{
    private int vida;
    private String nome;
    private Status status = Status.VIVO;
    public Dwarves(String nome){
        this.vida = 110;
        this.nome = nome;
    }
    public void perdeVida(){
         if (vida >= 10) 
            this.vida -= 10;
            if (vida == 0)
                status = Status.MORTO;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public int getVida(){
        return this.vida;
    }
    public Status getStatus(){
        return this.status;
    }
  
}
