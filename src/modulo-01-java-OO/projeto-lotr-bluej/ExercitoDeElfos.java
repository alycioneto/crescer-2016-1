import java.util.*;
public class ExercitoDeElfos{
     private HashMap<String,Elfo> exercito= new HashMap<>();
     private HashMap<Status,Elfo> statusDoExercito = new HashMap<>();
     public void alistarElfos(Elfo elfo){
         if(elfo instanceof ElfoNoturno || elfo instanceof ElfoVerde){
             exercito.put(elfo.getNome(),elfo);
         }   
     }
     public Elfo getElfoDoExercitoPeloNome(String nome){
         Elfo elfo = exercito.get(nome);
         return elfo;
     }
     public HashMap<String,Elfo> getExercito(){
         return this.exercito;
     }
     public void agruparPorStatus(){
        for(Elfo elfo : exercito.values()){
            statusDoExercito.put(elfo.getStatus(), elfo);
        }
     }
}
