import java.util.*;
public class AtaqueIntercalado implements EstrategiaDeAtaque
{
   private ArrayList<Elfo> ordemDoUltimoAtaque;
   public ArrayList<Elfo> getOrdemDoUltimoAtaque(){
        return this.ordemDoUltimoAtaque;
   }
   public void atacar(ArrayList<Elfo> pelotao, ArrayList<Dwarves> dwarves){
       ordemDoUltimoAtaque = new ArrayList<>();
       String tipoDoUltimoAtaque = "";
       for(Elfo elfo : pelotao){
           if(ordemDoUltimoAtaque.size()== 0 ){
               for(Dwarves dwarf : dwarves){
                   elfo.atirarFlecha(dwarf);
                   tipoDoUltimoAtaque = elfo.getClass().getName();
                   this.ordemDoUltimoAtaque.add(elfo);
               }
           }
           else if (tipoDoUltimoAtaque == elfo.getClass().getName()){
               int i = pelotao.indexOf(elfo);
               Elfo voltaProFimDaFila = elfo;
               pelotao.remove(i);
               pelotao.add(voltaProFimDaFila);
           }
           else {
              for(Dwarves dwarf : dwarves){
                  elfo.atirarFlecha(dwarf);
                  this.ordemDoUltimoAtaque.add(elfo);
              }
           }
       }
   }
}
