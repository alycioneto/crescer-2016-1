import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class DwarvesTest
{
    @Test
    public void CriarDwarfComVida110(){
        Dwarves gimli = new Dwarves("Gimli");
        assertEquals("Gimli",gimli.getNome());
        assertEquals(110 , gimli.getVida());
   }
   @Test
   public void dwarfPerde10Vida(){
       Dwarves gimli = new Dwarves("Gimli");
       gimli.perdeVida();
       assertEquals(100 , gimli.getVida());
    }
}
