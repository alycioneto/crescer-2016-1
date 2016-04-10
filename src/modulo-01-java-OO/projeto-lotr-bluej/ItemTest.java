import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ItemTest
{
   @Test
   public void aumentarAQuantidadeEmMil(){
    Item espada = new Item(1,"Espada");
    espada.aumentaQuantidade();
    assertEquals(1001, espada.getQuantidade());
   }
   @Test
   public void aumentarAQuantidadeMultiplasVezesMil(){
    Item espada = new Item(3,"Espada");
    espada.aumentaQuantidadeIrishDwarf(3);
    assertEquals(3003, espada.getQuantidade());
   }
}
