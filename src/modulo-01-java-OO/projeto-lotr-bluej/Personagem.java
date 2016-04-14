public abstract class Personagem
{
    protected int experiencia = 0;
    protected Status status = Status.VIVO;
    protected String nome;
    protected Inventario inventario = new Inventario();
    protected double vida;
    public Personagem(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public int getExperiencia(){
        return this.experiencia;
    }
    public Inventario getInventario(){
        return this.inventario;
    }
    public void adicionarItem(Item item){
        this.inventario.adicionarItem(item);
    }
    public void perderItem(Item item){
        this.inventario.removerItem(item);
    }
    public Status getStatus(){
        return this.status;
    }
    public double getVida(){
        return this.vida;
    }
    public boolean equals(Object obj){
        Personagem outro =((Personagem)obj); 
        return this.experiencia == outro.getExperiencia() && this.status == outro.getStatus() && this.nome.equals(outro.getNome()) && this.vida == outro.getVida() && this.inventario.equals(outro.getInventario());
    }
    public abstract void tentarSorte();
}
