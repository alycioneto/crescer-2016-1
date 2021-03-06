public class Item implements Comparable<Item>{
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
    public void aumentaQuantidade(){
        this.quantidade += 1000;
    }
    public void aumentaQuantidadeIrishDwarf(int vezesMultiplicas){
        this.quantidade = quantidade +(vezesMultiplicas * 1000);
    }
    public boolean equals(Object obj){
        Item outro = ((Item)obj);
        return this.quantidade == outro.getQuantidade() && this.descricao.equals(outro.getDescricao()) && this.descricao != null &&
            outro != null ;
    }
    public int compareTo(Item item){
         if ( this.quantidade == item.quantidade) 
            return 0;
        else if(this.quantidade > item.quantidade)
            return 1;
        else 
            return -1;
    }
}
