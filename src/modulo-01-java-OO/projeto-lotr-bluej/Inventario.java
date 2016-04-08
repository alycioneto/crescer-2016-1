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
    public String imprimir(){
        String itens = "";
        for(int i =0; i < lista.size(); i++){
                itens += lista.get(i).getDescricao() + ",";   
        }
        return !itens.isEmpty() ? itens.substring(0, itens.length() -1) : itens;
    }
    
}
