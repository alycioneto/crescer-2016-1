import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InventarioTest {
    @Test
    public void getDescricoesItensVazio() {
        Inventario inventario = new Inventario();
        String obtido = inventario.imprimirItens();
        assertEquals("", obtido);
    }

    @Test
    public void getDescricoesComUmItem() {
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item(1, "Espada"));
        String obtido = inventario.imprimirItens();
        assertEquals("Espada", obtido);
    }

    @Test
    public void getDescricoesComDoisItens() {
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item(1, "Espada"));
        inventario.adicionarItem(new Item(1, "Escudo"));
        String obtido = inventario.imprimirItens();
        assertEquals("Espada,Escudo", obtido);
    }
    @Test
    public void retornaItemDeMaiorQuantidade(){
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item(5, "Espada"));
         inventario.adicionarItem(new Item(10, "Machado"));
        inventario.adicionarItem(new Item(4, "Escudo"));
        assertEquals("Machado",inventario.maiorQuantidadeDeItens().getDescricao());
    }
    @Test
    public void colocarListaEmOrdem(){
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item(5, "Espada"));
        inventario.adicionarItem(new Item(4, "Escudo"));
        inventario.adicionarItem(new Item(10, "Machado"));
        inventario.adicionarItem(new Item(6, "Facas"));
        inventario.ordenarItens();
        assertEquals("Escudo,Espada,Facas,Machado" , inventario.imprimirItens());
    }
}
