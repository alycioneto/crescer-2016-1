import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ElfoVerdeTest
{
  @Test
  public void atirarFlechaDiminuiExperienciaEFlechas(){
    Elfo legolas = new ElfoVerde("Legolas");
    Dwarf gimli = new IrishDwarf("Gimli");
    legolas.atirarFlecha(gimli);
    assertEquals(2,legolas.getExperiencia());
    assertEquals(41,legolas.getFlechas());
  }
  @Test
  public void ElfoVerdeGanhaItem(){
      Elfo legolas = new ElfoVerde("Legolas");
      Item espada = new Item(1,"Espada de aço valiriano");
      legolas.adicionarItem(espada);
      String obtido = legolas.getInventario().imprimirItens();
      assertEquals("Espada de aço valiriano", obtido);
  }
  @Test
    public void dwarfNasceVivo(){
        Elfo legolas = new Elfo("legolas");
        assertEquals(legolas.getStatus(), Status.VIVO);
  }
}
