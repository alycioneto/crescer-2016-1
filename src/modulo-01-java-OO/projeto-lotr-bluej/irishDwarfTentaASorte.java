import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IrishDwarfTest
{
   @Test
    public void irishDwarfTentaASorte(){
        DataTerceiraEra data = new DataTerceiraEra(20,11,2008);
        IrishDwarf iDwarf = new IrishDwarf("Teste",data);
        for (int i = 0; i < 3; i++){
            iDwarf.perdeVida();
        }
        iDwarf.getInventario().adicionarItem(new Item(3, "Espada"));
        iDwarf.getInventario().adicionarItem(new Item(4, "Escudo"));
        iDwarf.tentarSorte();
        int quantidadePrimeiroItem = iDwarf.getInventario().getLista().get(0).getQuantidade();
        int quantidadeSegundoItem = iDwarf.getInventario().getLista().get(1).getQuantidade();
        assertEquals(quantidadePrimeiroItem , 6003);
        assertEquals(quantidadeSegundoItem , 10004);
          
    }
}
