import java.util.*;
public class AtaqueIntercalado implements EstrategiaDeAtaque
{
   private ArrayList<Elfo> ordemDoUltimoAtaque;
   public ArrayList<Elfo> getOrdemDoUltimoAtaque(){
        return this.ordemDoUltimoAtaque;
   }
   public void atacar(ArrayList<Elfo> pelotao, ArrayList<Dwarf> dwarves){
       ordemDoUltimoAtaque = new ArrayList<>();
       String tipoDoUltimoAtaque = "";
       int elfosNoturnos =0;
       int elfosVerdes =0;
       boolean naoTemExercito = pelotao == null;
       if(!naoTemExercito){
           for(Elfo elfo: pelotao){
               if(elfo instanceof ElfoVerde)
                    elfosVerdes++;                    
               else
                    elfosNoturnos++;
           }            
           if (elfosNoturnos == elfosVerdes){
               for(int i = 0; i <= pelotao.size() -1; i++){
                   Elfo elfoAtaque = pelotao.get(i);
                   if(ordemDoUltimoAtaque.size()== 0 ){
                       for(Dwarf dwarf : dwarves){
                           elfoAtaque.atirarFlecha(dwarf);
                           tipoDoUltimoAtaque = elfoAtaque.getClass().getName();
                       }
                        this.ordemDoUltimoAtaque.add(elfoAtaque);
                   }
                   else if (tipoDoUltimoAtaque == elfoAtaque.getClass().getName()){
                        Elfo voltaProFimDaFila = elfoAtaque;
                        pelotao.remove(i);
                        pelotao.add(voltaProFimDaFila);
                        i--;
                   } 
                   else {
                        for(Dwarf dwarf : dwarves){
                            elfoAtaque.atirarFlecha(dwarf);
                            tipoDoUltimoAtaque = elfoAtaque.getClass().getName();
                        }
                        this.ordemDoUltimoAtaque.add(elfoAtaque);
                   }
               }
           }   
       }
    }
}
