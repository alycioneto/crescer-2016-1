import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ElfoTest
{
  @Test
  public void CriarDwarfComVida110(){
       Elfo legolas = new Elfo("legolas");
       assertEquals("legolas",legolas.getNome());
       assertEquals(100 , legolas.getVida());
  }
  @Test
  public void criarElfoPadrao42Flechas(){
   Elfo legolas = new Elfo("Legolas");
   assertEquals(42,legolas.getFlechas());
  }
  @Test
  public void criarElfoInformandoFlechas(){
     Elfo e2 = new Elfo("e2", 20);
     assertEquals(20,e2.getFlechas());  
  }
  @Test
  public void atirarFlechaDiminuiExperienciaEFlechas(){
    Elfo legolas = new Elfo("Legolas");
    Dwarves gimli = new Dwarves("Gimli");
    legolas.atirarFlecha(gimli);
    assertEquals(1,legolas.getExperiencia());
    assertEquals(41,legolas.getFlechas());
  }
  @Test
  public void toStringImprimeNaSintaxeCorreta(){
      Elfo legolas = new Elfo("Legolas");
      assertEquals("Legolas possui 42 flechas e 0 de experiencia." , legolas.toString());
      Elfo e2 = new Elfo("e2", 20);
      assertEquals(e2.getNome() + " possui " + e2.getFlechas() + " flechas e " + e2.getExperiencia() + " de experiencia." , e2.toString());
  }
}
