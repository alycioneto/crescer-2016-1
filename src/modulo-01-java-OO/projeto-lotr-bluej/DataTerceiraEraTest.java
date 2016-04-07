import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class DataTerceiraEraTest
{
   @Test
   public void criarDataNaoBissexta(){
       DataTerceiraEra data = new DataTerceiraEra(10, 5 , 1900);
       assertEquals(false, data.ehBissexto());
   }
   @Test
   public void criarDataBissextaNaoDivisivelpor100(){
       DataTerceiraEra data = new DataTerceiraEra(10, 5 , 2008);
       assertEquals(true, data.ehBissexto());
   }
    @Test
   public void criarDataBissextaDivisivelpor400(){
       DataTerceiraEra data = new DataTerceiraEra(10, 5 , 2000);
       assertEquals(true, data.ehBissexto());
    }
}
