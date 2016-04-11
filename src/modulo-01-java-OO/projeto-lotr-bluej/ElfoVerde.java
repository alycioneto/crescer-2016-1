public class ElfoVerde extends Elfo{
    public ElfoVerde(String nome){
        super(nome);
    }
    public ElfoVerde(String nome, int flechas){
        super(nome,flechas);
    }
    public void atirarFlecha(Dwarves dwarf){
        this.flechas--;
        this.experiencia += 2;  
        dwarf.perdeVida();
    }    
    public void adicionarItem (Item item){
        if (item.getDescricao() == "Espada de aço valiriano" || item.getDescricao() == "Arco e Flecha de Vidro")
            this.inventario.adicionarItem(item);
    }
}