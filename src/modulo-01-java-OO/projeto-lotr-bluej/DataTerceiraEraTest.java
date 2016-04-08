import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class DataTerceiraEraTest
{
   @Test
   public void criarDataNaoBissexta(){
       DataTerceiraEra data = new DataTerceiraEra(10, 5 , 1900);
       assertFalse(data.ehBissexto());
   }
   @Test
   public void criarDataBissextaNaoDivisivelpor100(){
       DataTerceiraEra data = new DataTerceiraEra(10, 5 , 2008);
       assertTrue(data.ehBissexto());
   }
    @Test
   public void criarDataBissextaDivisivelpor400(){
       DataTerceiraEra data = new DataTerceiraEra(10, 5 , 2000);
       assertTrue(data.ehBissexto());
    }
    @Test
    public void toStringImprimindoCorretamente(){
        DataTerceiraEra data = new DataTerceiraEra(10, 5 , 2000);
        assertEquals("10/5/2000", data.toString());
    }
}
