import java.util.ArrayList;
public class Inventario{
    private ArrayList<Item> lista = new ArrayList<>();
    public void adicionarItem(Item item){
        this.lista.add(item);
    }
    public void removerItem(Item item){
           this.lista.remove(item);
    }
    public ArrayList<Item> getLista(){
        return this.lista;
    }
    public String imprimirItens(){
        String itens = "";
        for(int i =0; i < lista.size(); i++){
                itens += lista.get(i).getDescricao() + ",";   
        }
        return !itens.isEmpty() ? itens.substring(0, itens.length() -1) : itens;
    }
    public Item maiorQuantidadeDeItens(){
        int posicao = 0;
        for(int i =0; i < lista.size(); i++){
            if (lista.get(i).getQuantidade() > lista.get(posicao).getQuantidade() ){
                posicao = i;
            }
        }
        return lista.get(posicao);
    }
    public void ordenarItens(){
        if (!lista.isEmpty()){
            for(int a = 1 ; a <= this.lista.size(); a++){
                int i = a -1;
                for (int b = a + 1 ; b <= this.lista.size(); b++){
                    int j = b -1;
                    if (lista.get(i).getQuantidade() > this.lista.get(j).getQuantidade()){
                        Item temp = this.lista.get(i);
                        this.lista.set(i,this.lista.get(j));
                        this.lista.set(j, temp);
                    } 
                }
            }
        }
    }
    public boolean equals(Object obj){
        Inventario outro = ((Inventario)obj);
        boolean eIgual = true;
        if (this.lista == null && outro.getLista() == null)
            eIgual = true;  
        if((this.lista == null && outro.getLista() != null) || (this.lista != null && outro.getLista() == null) || lista.size() != outro.getLista().size())
            eIgual = false;
        for(int i =0; i <= lista.size()-1;i++){
            if(!lista.get(i).equals(outro.getLista().get(i)))
                eIgual = false;
        }
        return eIgual;
    }
}
