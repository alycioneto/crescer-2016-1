public class SerVivo{
    protected int experiencia = 0;;
    protected String nome;
    protected Inventario inventario = new Inventario();
    public SerVivo(String nome){
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
}