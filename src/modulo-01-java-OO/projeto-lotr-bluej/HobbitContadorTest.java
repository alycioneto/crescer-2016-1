import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class HobbitContadorTest
{
    @Test
    public void calculandoADiferencaCorretamente(){
       HobbitContador frodo = new HobbitContador();
       ArrayList<ArrayList<Integer>> arrayDePares = new ArrayList<>();
       arrayDePares.add(new ArrayList<>(Arrays.asList(15, 18)));
       arrayDePares.add(new ArrayList<>(Arrays.asList(4, 5)));
       arrayDePares.add(new ArrayList<>(Arrays.asList(12, 60)));
       assertEquals(frodo.calcularDiferenca(arrayDePares),840);
    }
    @Test
    public void calculandoADiferencaComArrayVazio(){
        HobbitContador frodo = new HobbitContador();
        ArrayList<ArrayList<Integer>> arrayDePares = new ArrayList<>();
        assertEquals(frodo.calcularDiferenca(arrayDePares),0);
    }
    @Test
    public void verificarOMMC(){
        HobbitContador frodo = new HobbitContador();
        assertEquals(frodo.minimoMultiploComum(5, 4), 20);
    }
    @Test
    public void maiorMultiploDeTres(){
        HobbitContador frodo = new HobbitContador();
        assertEquals(9 ,frodo.obterMaiorMultiploDeTresAte(10));
    }
    @Test
    public void multiplosDeTresAte(){
        HobbitContador frodo = new HobbitContador();
        ArrayList multiplos = frodo.obterMultiplosDeTresAte(10);
        assertEquals(0,multiplos.get(0));
        assertEquals(3,multiplos.get(1));
        assertEquals(6,multiplos.get(2));    
        assertEquals(9,multiplos.get(3));  
    }
}
