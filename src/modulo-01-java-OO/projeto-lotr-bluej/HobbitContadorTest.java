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
    public void verificarOMMC(){
        HobbitContador frodo = new HobbitContador();
        assertEquals(frodo.minimoMultiploComum(5, 4), 20);
    }
}
