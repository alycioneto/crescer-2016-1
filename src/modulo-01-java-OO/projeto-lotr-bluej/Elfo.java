public class Elfo extends Personagem implements Comparable<Elfo>{
    protected int flechas;
    private static int elfosCriados =0;
    public Elfo(String nome){
        super(nome);
        this.flechas = 42;
        this.vida = 100;
        elfosCriados++;
    }
    public Elfo(String nome, int flechas){
        this(nome);
        this.flechas = flechas;
    }
    public void atirarFlecha(Dwarf dwarf){
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
    public static int quantosElfosCriados(){
        return elfosCriados;
    }
    public boolean equals (Object obj){
        Elfo outro = ((Elfo)obj);
        return super.equals(outro) && this.flechas == outro.getFlechas();
    }
    public void tentarSorte(){   
    }
    //http://www.javapractices.com/topic/TopicAction.do?Id=10
    public int compareTo(Elfo elfo){
        if (this.getClass() == elfo.getClass()) 
            return 0;
        else if(elfo instanceof ElfoVerde)
            return 1;
        else 
            return -1;
    }
}
