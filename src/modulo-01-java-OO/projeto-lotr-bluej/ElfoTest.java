import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ElfoTest
{
  @Test
  public void testarConstrutor(){
   Elfo legolas = new Elfo("Legolas");
   assertEquals("Legolas",legolas.getNome());
   assertEquals(0,legolas.getExperiencia());
   assertEquals(42,legolas.getFlechas());
   }
  @Test
  public void testarAtirarFlecha(){
    Elfo legolas = new Elfo("Legolas");
    Dwarves gimli = new Dwarves("Gimli");
    legolas.atirarFlecha(gimli);
    assertEquals(1,legolas.getExperiencia());
    assertEquals(41,legolas.getFlechas());
  }
  @Test
  public void testarToString(){
      Elfo legolas = new Elfo("Legolas");
      assertEquals("Legolas possui 42 flechas e 0 de experiencia." , legolas.toString());
  }
}