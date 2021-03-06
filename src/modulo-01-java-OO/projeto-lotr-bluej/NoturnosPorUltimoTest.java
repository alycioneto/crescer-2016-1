import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
public class NoturnosPorUltimoTest
{
    @Test
     public void elfosAtacam(){
        Elfo e0 = new ElfoVerde("e0");
        Elfo e1 = new ElfoNoturno("e1");
        Elfo e2 = new ElfoNoturno("e2");
        Elfo e3 = new ElfoNoturno("e3");
        Elfo e4 = new ElfoVerde("e4");
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        exercito.alistarElfos(e0);
        exercito.alistarElfos(e1);
        exercito.alistarElfos(e2);
        exercito.alistarElfos(e3);
        exercito.alistarElfos(e4);
        exercito.agruparPorStatus();
        ArrayList<Dwarf> hordaDeDwarves = new ArrayList<>();
        Dwarf d1 = new Dwarf("d1");
        Dwarf d2 = new Dwarf("d2");       
        hordaDeDwarves.add(d1);
        hordaDeDwarves.add(d2);
        EstrategiaDeAtaque estrategia = new NoturnosPorUltimo();
        estrategia.atacar(exercito.buscar(Status.VIVO), hordaDeDwarves);
        ArrayList<Elfo> obtido = estrategia.getOrdemDoUltimoAtaque();    
        ArrayList<Elfo> esperado = new ArrayList<Elfo>();
        esperado.add(e0);
        esperado.add(e4);
        esperado.add(e1);
        esperado.add(e2);
        esperado.add(e3);

        assertEquals(esperado, obtido);
    }
    @Test
    public void ataqueComExercitoVazio() {
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        exercito.mudarEstrategia(new NoturnosPorUltimo());
        exercito.atacar(new ArrayList<>(Arrays.asList(new Dwarf("D1"), new Dwarf("D2"))));
        List<Elfo> ordemAtaque = exercito.getOrdemDoUltimoAtaque();
        assertTrue(ordemAtaque.isEmpty());
    }
}

