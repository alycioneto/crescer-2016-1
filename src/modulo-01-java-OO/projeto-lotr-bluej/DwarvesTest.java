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
    public void dwarfSemInformarData(){
       Dwarves gimli = new Dwarves("Gimli");
       assertEquals(gimli.getDataNacimento().toString(), "1/1/1");
    }
    @Test
    public void dwarfInformandoData(){
       DataTerceiraEra data = new DataTerceiraEra(20,11,2008);
       Dwarves gimli = new Dwarves("Gimli",data);
       assertEquals(gimli.getDataNacimento().toString() , "20/11/2008");
    }
    @Test
    public void dwarfToma10DeDano(){
       DataTerceiraEra data = new DataTerceiraEra(20,11,2008);
       Dwarves gimli = new Dwarves("gimli",data);
       gimli.perdeVida();
       assertEquals(100 , gimli.getVida());
       assertEquals(0 , gimli.getExperiencia());
    }
    @Test
    public void dwarfGanhaExperiencia(){
       DataTerceiraEra data = new DataTerceiraEra(20,11,2008);
       Dwarves gimli = new Dwarves("gimli",data);
       for (int i = 0; i <= 2; i++){
           gimli.perdeVida();
       }
       assertEquals(90 , gimli.getVida());
       assertEquals(2 , gimli.getExperiencia());
    }
    @Test
    public void dwarfSeixasNaoTomaDano(){
       DataTerceiraEra data = new DataTerceiraEra(20,11,2009);
       Dwarves seixas = new Dwarves("Seixas",data);
       seixas.perdeVida();
       assertEquals(110 , seixas.getVida());
    }
    @Test
    public void dwarfNasceVivo(){
        Dwarves gimli = new Dwarves("Gimli");
        assertEquals(gimli.getStatus(), Status.VIVO);
    }
    @Test
    public void morteDoDwarf(){
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
    @Test
    public void dwarfGanhaItem(){
        Item espada = new Item(1, "Espada");
        Dwarves gimli = new Dwarves("gimli");
        gimli.adicionarItem(espada);
        int tamanhoInventario = gimli.getInventario().getLista().size();
        assertEquals(tamanhoInventario, 1);
    }
    @Test
    public void dwarfPerdeItem(){
        Item espada = new Item(1, "Espada");
        Dwarves gimli = new Dwarves("gimli");
        gimli.adicionarItem(espada);
        int tamanhoInventario = gimli.getInventario().getLista().size();
        assertEquals(tamanhoInventario, 1);
        gimli.perderItem(espada);
        int novoTamanhoDoInventario = gimli.getInventario().getLista().size();
        assertEquals(novoTamanhoDoInventario, 0);
    }
    @Test
    public void numeroDaSorteComAnoBissextoVidaEntre80E90(){
        DataTerceiraEra data = new DataTerceiraEra(20,11,2008);
        Dwarves gimli = new Dwarves("gimli",data);
        for (int i = 0; i < 3; i++){
            gimli.perdeVida();
        }
        boolean obtido = gimli.getNumeroSorte() == -3333.0;
        assertTrue(obtido);
          
    }
    @Test
    public void numeroDaSorteSemAnoBissextoVidaEntre80E90(){
        DataTerceiraEra data = new DataTerceiraEra(20,11,2009);
        Dwarves gimli = new Dwarves("gimli",data);
         for (int i = 0; i < 3; i++){
            gimli.perdeVida();
        }
        boolean obtido = gimli.getNumeroSorte() == 101.0;
        assertTrue(obtido);
          
    }
    @Test
    public void numeroDaSorteComAnoBissextoVida110(){
        DataTerceiraEra data = new DataTerceiraEra(20,11,2008);
        Dwarves gimli = new Dwarves("gimli",data);
        boolean obtido = gimli.getNumeroSorte() == 101.0;
        assertTrue(obtido);
          
    }
    @Test
    public void numeroDaSorteSemAnoBissextoNomeSeixasEMeireles(){
        DataTerceiraEra data = new DataTerceiraEra(20,11,2009);
        Dwarves seixas = new Dwarves("Seixas",data);
        boolean obtidoSeixas = seixas.getNumeroSorte() == 33.0;
        assertTrue(obtidoSeixas);
        Dwarves meireles = new Dwarves("Meireles",data);
        boolean obtidoMeireles = meireles.getNumeroSorte() == 33.0;
        assertTrue(obtidoMeireles);
          
    }
    @Test
    public void numeroDaSorteComAnoBissextoNomeSeixasEMeireles(){
       DataTerceiraEra data = new DataTerceiraEra(20,11,2008);
        Dwarves seixas = new Dwarves("Seixas",data);
        boolean obtidoSeixas = seixas.getNumeroSorte() == 101.0;
        assertTrue(obtidoSeixas);
        Dwarves meireles = new Dwarves("Meireles",data);
        boolean obtidoMeireles = meireles.getNumeroSorte() == 101.0;
        assertTrue(obtidoMeireles);
          
    }
    
}

