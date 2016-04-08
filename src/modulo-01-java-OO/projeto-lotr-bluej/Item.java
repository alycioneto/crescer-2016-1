public class Item{
    private String descricao;
    private int quantidade;
    public Item(int quantidade ,String descricao){
        this.quantidade = quantidade;
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
}