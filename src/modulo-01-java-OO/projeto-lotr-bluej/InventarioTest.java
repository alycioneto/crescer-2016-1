import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class InventarioTest
{
    @Test
    public void colocandoItemNoIventario(){
        Item espada = new Item(1, "Espada");
        Inventario bolsa = new Inventario();
        bolsa.adicionarItem(espada);
        assertTrue(bolsa.getLista().size() == 1);
    }
    @Test
    public void tirandoItemDoIventario(){
        Item espada = new Item(1, "Espada");
        Inventario bolsa = new Inventario();
        bolsa.adicionarItem(espada);
        assertTrue(bolsa.getLista().size() == 1);
        bolsa.removerItem(espada);
        assertTrue(bolsa.getLista().size()== 0);
    }
   
}

