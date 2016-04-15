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
       int elfosNoturnos =0;
       int elfosVerdes =0;
       for(Elfo elfo: pelotao){
           if(elfo instanceof ElfoVerde)
                elfosVerdes++;
           else
                elfosNoturnos++;
       }
       if (elfosNoturnos == elfosVerdes){
           for(int i = 0; i <= pelotao.size() -1; i++){
               if(ordemDoUltimoAtaque.size()== 0 ){
                   for(Dwarves dwarf : dwarves){
                       pelotao.get(i).atirarFlecha(dwarf);
                       tipoDoUltimoAtaque = pelotao.get(i).getClass().getName();
                    }
                    this.ordemDoUltimoAtaque.add(pelotao.get(i));
                }
                else if (tipoDoUltimoAtaque == pelotao.get(i).getClass().getName()){
                    Elfo voltaProFimDaFila = pelotao.get(i);
                    pelotao.remove(i);
                    pelotao.add(voltaProFimDaFila);
                    i--;
                } 
                else {
                    for(Dwarves dwarf : dwarves){
                        pelotao.get(i).atirarFlecha(dwarf);
                        tipoDoUltimoAtaque = pelotao.get(i).getClass().getName();
                    }
                    this.ordemDoUltimoAtaque.add(pelotao.get(i));
                }
            }
        }
    }
}
