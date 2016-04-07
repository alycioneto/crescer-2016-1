import java.util.ArrayList;
public class Inventario{
    ArrayList<Item> lista = new ArrayList<>();
    public void adicionarItem(Item item){
        this.lista.add(item);
    }
    public void removerItem(Item item){
           this.lista.remove(item);
    }
}