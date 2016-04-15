import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ArteDaGuerraTest
{
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
        exercito.agruparPorStatus();
        ArrayList<Dwarves> hordaDeDwarves = new ArrayList<>();
        Dwarves d1 = new Dwarves("d1");
        Dwarves d2 = new Dwarves("d2");       
        hordaDeDwarves.add(d1);
        hordaDeDwarves.add(d2);
        ArteDaGuerra estrategia = new ArteDaGuerra();
        estrategia.atacar(exercito.buscar(Status.VIVO), hordaDeDwarves);
        ArrayList<Elfo> listaDeElfos = estrategia.getOrdemDoUltimoAtaque();
        assertTrue(listaDeElfos.contains(e0));
        assertFalse(listaDeElfos.contains(e1));
        assertFalse(listaDeElfos.contains(e2));
        assertFalse(listaDeElfos.contains(e3));
        
       
    }
}
