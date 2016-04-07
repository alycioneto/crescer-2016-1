import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class InventarioTest
{
    @Test
    public void verificarItemAdicionar(){
        Item espada = new Item(1, "Espada");
        Inventario bolsa = new Inventario();
        bolsa.adicionarItem(espada);
        assertEquals(bolsa(0).getDescricao(),espada.getDescricao());
    }
}
