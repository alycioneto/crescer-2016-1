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
    public void atirarFlecha(){
        this.flechas--;
        this.experiencia++;
        
        
    }
    public void atirarFlechaDwarves(Dwarves dwarf){
        if(dwarf.getVida() > 0){
            atirarFlecha();
            dwarf.setVida(dwarf.getVida() - 10);
        }
    }
}
