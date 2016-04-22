import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class DwarfTest
{
    @Test
    public void CriarDwarfComVida110(){
        Dwarf gimli = new Dwarf("Gimli");
        assertEquals("Gimli",gimli.getNome());
        assertEquals(gimli.getVida(), 110.0, 110.0);
    }
    @Test
    public void dwarfSemInformarData(){
       Dwarf gimli = new Dwarf("Gimli");
       assertEquals(gimli.getDataNacimento().toString(), "1/1/1");
    }
    @Test
    public void dwarfInformandoData(){
       DataTerceiraEra data = new DataTerceiraEra(20,11,2008);
       Dwarf gimli = new Dwarf("Gimli",data);
       assertEquals(gimli.getDataNacimento().toString() , "20/11/2008");
    }
    @Test
    public void dwarfToma10DeDano(){
       DataTerceiraEra data = new DataTerceiraEra(20,11,2008);
       Dwarf gimli = new Dwarf("gimli",data);
       gimli.perdeVida();
       assertEquals(gimli.getVida(),100.0 ,100);
       assertEquals(0 , gimli.getExperiencia());
    }
    @Test
    public void dwarfGanhaExperiencia(){
       DataTerceiraEra data = new DataTerceiraEra(20,11,2008);
       Dwarf gimli = new Dwarf("gimli",data);
       for (int i = 0; i <= 2; i++){
           gimli.perdeVida();
       }
       assertEquals(gimli.getVida(), 90.0 , 90.0);
       assertEquals(2 , gimli.getExperiencia());
    }
    @Test
    public void dwarfSeixasNaoTomaDano(){
       DataTerceiraEra data = new DataTerceiraEra(20,11,2009);
       Dwarf seixas = new Dwarf("Seixas",data);
       seixas.perdeVida();
       assertEquals(seixas.getVida(), 110.0, 110);
    }
    @Test
    public void dwarfNasceVivo(){
        Dwarf gimli = new Dwarf("Gimli");
        assertEquals(gimli.getStatus(), Status.VIVO);
    }
    @Test
    public void morteDoDwarf(){
        Dwarf gimli = new Dwarf("Gimli");
        int i = 0;
        while(i <= 12){
            gimli.perdeVida();
            i++;
        }
        assertEquals(gimli.getStatus(), Status.MORTO);  
        assertEquals(gimli.getVida(),0.0 , 0.0);
    }
    @Test
    public void anaoPodeDeverVida(){
        Dwarf gimli = new Dwarf("Gimli");
        int i = 0;
        while(i <= 11){
            gimli.perdeVida();
            i++;
        }
        assertEquals(gimli.getVida(),0.0 , 0.0);
        assertEquals(gimli.getStatus(), Status.MORTO);
    }
    @Test
    public void dwarfGanhaItem(){
        Item espada = new Item(1, "Espada");
        Dwarf gimli = new Dwarf("gimli");
        gimli.adicionarItem(espada);
        int tamanhoInventario = gimli.getInventario().getLista().size();
        assertEquals(tamanhoInventario, 1);
    }
    @Test
    public void dwarfPerdeItem(){
        Item espada = new Item(1, "Espada");
        Dwarf gimli = new Dwarf("gimli");
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
        Dwarf gimli = new Dwarf("gimli",data);
        for (int i = 0; i < 3; i++){
            gimli.perdeVida();
        }
        boolean obtido = gimli.getNumeroSorte() == -3333.0;
        assertTrue(obtido);
          
    }
    @Test
    public void numeroDaSorteSemAnoBissextoVidaEntre80E90(){
        DataTerceiraEra data = new DataTerceiraEra(20,11,2009);
        Dwarf gimli = new Dwarf("gimli",data);
         for (int i = 0; i < 3; i++){
            gimli.perdeVida();
        }
        boolean obtido = gimli.getNumeroSorte() == 101.0;
        assertTrue(obtido);
          
    }
    @Test
    public void numeroDaSorteComAnoBissextoVida110(){
        DataTerceiraEra data = new DataTerceiraEra(20,11,2008);
        Dwarf gimli = new Dwarf("gimli",data);
        boolean obtido = gimli.getNumeroSorte() == 101.0;
        assertTrue(obtido);
          
    }
    @Test
    public void numeroDaSorteSemAnoBissextoNomeSeixasEMeireles(){
        DataTerceiraEra data = new DataTerceiraEra(20,11,2009);
        Dwarf seixas = new Dwarf("Seixas",data);
        boolean obtidoSeixas = seixas.getNumeroSorte() == 33.0;
        assertTrue(obtidoSeixas);
        Dwarf meireles = new Dwarf("Meireles",data);
        boolean obtidoMeireles = meireles.getNumeroSorte() == 33.0;
        assertTrue(obtidoMeireles);
          
    }
    @Test
    public void numeroDaSorteComAnoBissextoNomeSeixasEMeireles(){
       DataTerceiraEra data = new DataTerceiraEra(20,11,2008);
        Dwarf seixas = new Dwarf("Seixas",data);
        boolean obtidoSeixas = seixas.getNumeroSorte() == 101.0;
        assertTrue(obtidoSeixas);
        Dwarf meireles = new Dwarf("Meireles",data);
        boolean obtidoMeireles = meireles.getNumeroSorte() == 101.0;
        assertTrue(obtidoMeireles);
          
    }  
    @Test
    public void dwarfRecebeFlechadaNormal(){
        Dwarf dwarf = new Dwarf("Dwarf");
        dwarf.perdeVida();
        assertEquals(100, dwarf.getVida(), 0.0);
        assertEquals(0, dwarf.getExperiencia());
    }
    @Test
    public void dwarfLeprechaunComSorte() {
        DataTerceiraEra data = new DataTerceiraEra(20,11,2008);
        Dwarf gimli = new Dwarf("gimli",data);
        Item espada = new Item(5,"Espada");
        gimli.adicionarItem(espada);
        gimli.perdeVida();
        gimli.perdeVida();
        gimli.tentarSorte();
        assertEquals(1005, gimli.getInventario().getLista().get(0).getQuantidade());
    }
    @Test
    public void descobrirVidaComDoisIguais(){
        Dwarf dwarfMenor = Dwarf.descobrirMenosVida(new Dwarf("D1"), new Dwarf("D2"));
        assertEquals("D2", dwarfMenor.getNome());
        
    }
    @Test
    public void descobrirgeVidaComOPrimeiroMenor(){
        Dwarf d1 = new Dwarf("D1");
        d1.perdeVida();
        Dwarf d2 = new Dwarf("D2");
        assertEquals(d1, Dwarf.descobrirMenosVida(d1,d2));
    }
    @Test
    public void descobrirVidaComOSegundoMenor(){
        Dwarf d1 = new Dwarf("D1");
        Dwarf d2 = new Dwarf("D2");
        d2.perdeVida();
        assertEquals(d2, Dwarf.descobrirMenosVida(d1,d2));   
    }
    @Test
    public void dwarfIguais(){
        DataTerceiraEra data1 = new DataTerceiraEra(1,1,2000);
        DataTerceiraEra data2 = new DataTerceiraEra(1,1,2000);
        Dwarf d1 = new Dwarf("d1", data1);
        Dwarf d2 = new Dwarf("d1", data2);
        assertEquals(d1,d2);
    }
    @Test
     public void dwarfDiferentes(){
        DataTerceiraEra data1 = new DataTerceiraEra(1,1,2000);
        DataTerceiraEra data2 = new DataTerceiraEra(2,2,2002);
        Dwarf d1 = new Dwarf("d1", data1);
        Dwarf d2 = new Dwarf("d1", data2);
        boolean obtido = d1.equals(d2);
        assertFalse(obtido);
    }
}
