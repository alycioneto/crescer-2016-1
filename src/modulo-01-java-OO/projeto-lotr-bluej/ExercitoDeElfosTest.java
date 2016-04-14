import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
public class ExercitoDeElfosTest
{
    @Test
    public void alistarElfosAoExercito(){
        Elfo legolas = new ElfoVerde("Legolas");
        Elfo e2 = new ElfoNoturno("e2");
        Elfo e3 =  new Elfo("e3");
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        exercito.alistarElfos(legolas);
        exercito.alistarElfos(e2);
        exercito.alistarElfos(e3);
        int obtido = exercito.getExercito().size();
        assertEquals(2 , obtido);
    }
    @Test
    public void encontrarElfoPeloNome(){
        Elfo legolas = new ElfoVerde("Legolas");
        Elfo e2 = new ElfoNoturno("e2");
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        exercito.alistarElfos(legolas);
        exercito.alistarElfos(e2);
        Elfo obtido = exercito.getElfoDoExercitoPeloNome("Legolas");
        assertEquals(legolas , obtido);
    }
    @Test
    public void encontrarElfosVivos(){
        Elfo e0 = new ElfoNoturno("e0");
        Elfo e1 = new ElfoNoturno("e1");
        Elfo e2 = new ElfoNoturno("e2");
        Elfo e3 = new ElfoNoturno("e3");
        ExercitoDeElfos exercito = new ExercitoDeElfos();
        exercito.alistarElfos(e0);
        exercito.alistarElfos(e1);
        exercito.alistarElfos(e2);
        exercito.alistarElfos(e3);
        exercito.agruparPorStatus();
        ArrayList<Elfo> elfosEsperados = new ArrayList<>();
        elfosEsperados.add(e0);
        elfosEsperados.add(e1);
        elfosEsperados.add(e2);
        elfosEsperados.add(e3);
        ArrayList<Elfo> elfosObtidos = exercito.buscar(Status.VIVO);
        assertTrue(elfosEsperados.equals(elfosEsperados));
    }
    
}
