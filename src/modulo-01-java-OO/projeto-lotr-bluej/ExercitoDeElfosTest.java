import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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
    
}
