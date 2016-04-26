import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ArteDaGuerraTest
{   
     @After
    public void tearDown() {
        System.gc();
    }
    @Test
    public void elfosAtacam(){
        Elfo e0 = new ElfoVerde("e0");
        Elfo e1 = new ElfoNoturno("e1");
        Elfo e2 = new ElfoNoturno("e2");
        Elfo e3 = new ElfoNoturno("e3");
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        exercito.alistarElfos(e0);
        exercito.alistarElfos(e1);
        exercito.alistarElfos(e2);
        exercito.alistarElfos(e3);
        ArrayList<Dwarf> hordaDeDwarves = new ArrayList<>();
        Dwarf d1 = new Dwarf("d1");
        Dwarf d2 = new Dwarf("d2");       
        hordaDeDwarves.add(d1);
        hordaDeDwarves.add(d2);
        ArteDaGuerra estrategia = new ArteDaGuerra();
        estrategia.atacar(exercito.buscar(Status.VIVO), hordaDeDwarves);
        ArrayList<Elfo> listaDeElfos = estrategia.getOrdemDoUltimoAtaque();
        assertTrue(listaDeElfos.contains(e0));
        assertTrue(listaDeElfos.contains(e1));
        assertFalse(listaDeElfos.contains(e2));
        assertFalse(listaDeElfos.contains(e3));     
    }
    @Test
    public void ataqueComExercitoVazio() {
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        exercito.mudarEstrategia(new ArteDaGuerra());
        exercito.atacar(new ArrayList<>(Arrays.asList(new Dwarf("D1"), new Dwarf("D2"))));
        List<Elfo> ordemAtaque = exercito.getOrdemDoUltimoAtaque();
        assertTrue(ordemAtaque.isEmpty());
    }

}
