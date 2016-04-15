import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class AtaqueIntercaladoTest
{
    @Test
    public void elfosAtacam(){
        Elfo e0 = new ElfoVerde("e0");
        Elfo e1 = new ElfoNoturno("e1");
        Elfo e2 = new ElfoNoturno("e2");
        Elfo e3 = new ElfoVerde("e3");
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
        EstrategiaDeAtaque estrategia = new AtaqueIntercalado();
        estrategia.atacar(exercito.buscar(Status.VIVO), hordaDeDwarves);
        ArrayList<Elfo> obtido = estrategia.getOrdemDoUltimoAtaque();
        assertEquals(obtido.get(0),e0);
        assertEquals(obtido.get(1),e1);
        assertEquals(obtido.get(2),e3);
        assertEquals(obtido.get(3),e2);     
    }
    public void exercitoSemElfo(){
        ExercitoDeElfos exercito = new ExercitoDeElfos();;
        ArrayList<Dwarves> hordaDeDwarves = new ArrayList<>();
        Dwarves d1 = new Dwarves("d1");
        Dwarves d2 = new Dwarves("d2"); 
        hordaDeDwarves.add(d1);
        hordaDeDwarves.add(d2);
        EstrategiaDeAtaque estrategia = new AtaqueIntercalado();
        estrategia.atacar(exercito.buscar(Status.VIVO), hordaDeDwarves);
        ArrayList<Elfo> obtido = estrategia.getOrdemDoUltimoAtaque();
        assertNull(obtido);
    }
    public void comQuantidadeDiferenteDeElfos(){
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        Elfo e0 = new ElfoVerde("e0");
        exercito.alistarElfos(e0);
        ArrayList<Dwarves> hordaDeDwarves = new ArrayList<>();
        Dwarves d1 = new Dwarves("d1");
        Dwarves d2 = new Dwarves("d2"); 
        hordaDeDwarves.add(d1);
        hordaDeDwarves.add(d2);
        EstrategiaDeAtaque estrategia = new AtaqueIntercalado();
        estrategia.atacar(exercito.buscar(Status.VIVO), hordaDeDwarves);
        ArrayList<Elfo> obtido = estrategia.getOrdemDoUltimoAtaque();
        assertNull(obtido);
    }
}
