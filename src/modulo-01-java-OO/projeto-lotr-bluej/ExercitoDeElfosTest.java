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
    @Test
    public void encontrarElfosMortos(){
        Elfo e0 = criarElfoEMataLo("e0");
        Elfo e1 = criarElfoEMataLo("e1");
        Elfo e2 = criarElfoEMataLo("e2");
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
        ArrayList<Elfo> elfosObtidos = exercito.buscar(Status.MORTO);
        assertTrue(elfosEsperados.equals(elfosEsperados));
    }
    @Test
    public void ataqueDeElfosIntercalados(){
   
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
        exercito.mudarEstrategia(new AtaqueIntercalado());
        exercito.atacar(hordaDeDwarves);
        ArrayList<Elfo> obtido = exercito.getOrdemDoUltimoAtaque();
        assertEquals(obtido.get(0),e0);
        assertEquals(obtido.get(1),e1);
        assertEquals(obtido.get(2),e3);
        assertEquals(obtido.get(3),e2);     
    }
    @Test
     public void elfosNoturnosAtacamPrimeito(){
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
        ArrayList<Dwarves> hordaDeDwarves = new ArrayList<>();
        Dwarves d1 = new Dwarves("d1");
        Dwarves d2 = new Dwarves("d2");       
        hordaDeDwarves.add(d1);
        hordaDeDwarves.add(d2);
        exercito.atacar(hordaDeDwarves);
        ArrayList<Elfo> obtido = exercito.getOrdemDoUltimoAtaque();    
        ArrayList<Elfo> esperado = new ArrayList<Elfo>();
        esperado.add(e0);
        esperado.add(e4);
        esperado.add(e1);
        esperado.add(e2);
        esperado.add(e3);

        assertEquals(esperado, obtido);
    }
    @Test
    public void artedoAtaque(){
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
        exercito.mudarEstrategia(new AtaqueIntercalado());
        exercito.atacar(hordaDeDwarves);
        ArrayList<Elfo> listaDeElfos = exercito.getOrdemDoUltimoAtaque();
        assertTrue(listaDeElfos.contains(e0));
        assertTrue(listaDeElfos.contains(e1));
        assertFalse(listaDeElfos.contains(e2));
        assertFalse(listaDeElfos.contains(e3));
    }
    
    private Elfo criarElfoEMataLo(String nome) {
        Elfo elfo = new ElfoNoturno(nome);
        // Forçando o hara-kiri
        for (int i = 0; i < 90; i++) {
            elfo.atirarFlecha(new Dwarves("Gimli"));
        }
        return elfo;
    }
    
    
}
