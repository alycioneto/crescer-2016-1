import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ElfoNoturnoTest
{
    @Test
    public void elfoNoturnoMorre(){
        Elfo elfo = new ElfoNoturno("Elfo");
        while (elfo.getStatus() != Status.MORTO){
            elfo.atirarFlecha(new Dwarves ("gimli"));
        }
        assertEquals(elfo.getStatus() , Status.MORTO);
    }
}
