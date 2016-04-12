public class ElfoNoturno extends Elfo{
    public ElfoNoturno(String nome){
        super(nome);
    }
     public ElfoNoturno(String nome, int flechas){
        super(nome,flechas);
    }
    public void atirarFlecha(Dwarves dwarf){
        this.flechas--;
        this.experiencia += 3; 
        dwarf.perdeVida();
        if(this.vida < 1)
            this.status = Status.MORTO;
        else
            this.vida -= vida * 0.05;
    }

}
