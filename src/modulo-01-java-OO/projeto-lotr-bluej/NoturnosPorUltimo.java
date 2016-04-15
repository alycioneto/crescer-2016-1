import java.util.*;
public class NoturnosPorUltimo implements EstrategiaDeAtaque
{
   private ArrayList<Elfo> ordemDoUltimoAtaque;
   public ArrayList<Elfo> getOrdemDoUltimoAtaque(){
        return this.ordemDoUltimoAtaque;
   }
   public void atacar(ArrayList<Elfo> pelotao, ArrayList<Dwarves> dwarves){
       ordemDoUltimoAtaque = new ArrayList<>();
       ArrayList<Elfo> elfosNoturnos = new ArrayList<>();
       for(Elfo elfo : pelotao){
           if (elfo instanceof ElfoVerde){
               for (Dwarves dwarf : dwarves){
                   elfo.atirarFlecha(dwarf);
               }
               this.ordemDoUltimoAtaque.add(elfo);
           }
           else
                elfosNoturnos.add(elfo);
       }     
       for(Elfo elfo : elfosNoturnos){
           for (Dwarves dwarf : dwarves){
               elfo.atirarFlecha(dwarf);
           }
           this.ordemDoUltimoAtaque.add(elfo);
       }
   }
}
