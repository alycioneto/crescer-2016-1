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
    @Test
    public void dwarfNasceVivo(){
        Dwarves gimli = new Dwarves("Gimli");
        assertEquals(gimli.getStatus(), Status.VIVO);
    }
    @Test
    public void aMorteDoDwarf(){
        Dwarves gimli = new Dwarves("Gimli");
        int i = 0;
        while(i <= 12){
            gimli.perdeVida();
            i++;
        }
        assertEquals(gimli.getStatus(), Status.MORTO);  
        assertEquals(gimli.getVida(),0);
    }
    @Test
    public void anaoPodeDeverVida(){
        Dwarves gimli = new Dwarves("Gimli");
        int i = 0;
        while(i <= 11){
            gimli.perdeVida();
            i++;
        }
        assertEquals(gimli.getVida(),0);
        assertEquals(gimli.getStatus(), Status.MORTO);
    }
}

