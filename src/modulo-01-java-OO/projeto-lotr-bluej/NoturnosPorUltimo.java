import java.util.*;
public class NoturnosPorUltimo implements EstrategiaDeAtaque
{
   private ArrayList<Elfo> ordemDoUltimoAtaque;
   public ArrayList<Elfo> getOrdemDoUltimoAtaque(){
        return this.ordemDoUltimoAtaque;
   }
   public void atacar(ArrayList<Elfo> pelotao, ArrayList<Dwarf> dwarves){
       ordemDoUltimoAtaque = new ArrayList<>();
       Collections.sort(pelotao);
       for (Elfo elfo : pelotao){
            for (Dwarf dwarf : dwarves){
                elfo.atirarFlecha(dwarf);
            }
            this.ordemDoUltimoAtaque.add(elfo);
       }
    }
}

