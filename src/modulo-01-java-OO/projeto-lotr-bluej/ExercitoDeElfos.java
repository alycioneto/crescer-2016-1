import java.util.*;
public class ExercitoDeElfos{
    private HashMap<String,Elfo> exercito= new HashMap<>();
    private HashMap<Status,ArrayList<Elfo>> statusDoExercito = new HashMap<>();
    private EstrategiaDeAtaque estrategia = new NoturnosPorUltimo();
    public void alistarElfos(Elfo elfo) {
        //throws NaoPodeAlistarException
        boolean podeAlistar = elfo instanceof ElfoNoturno || elfo instanceof ElfoVerde;
        if(podeAlistar){
            //throw new NaoPodeAlistarException();
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
     //http://stackoverflow.com/questions/12134687/how-to-add-element-into-arraylist-in-hashmap
    public void agruparPorStatus(){
       statusDoExercito.clear();
       for(Elfo elfo : exercito.values()){
            if(!statusDoExercito.containsKey(elfo.getStatus()))
                statusDoExercito.put(elfo.getStatus(), new ArrayList<Elfo>());
            statusDoExercito.get(elfo.getStatus()).add(elfo);
       }
    }
    public ArrayList<Elfo> buscar(Status status){
         agruparPorStatus();
         return statusDoExercito.get(status);
    }
      public void atacar(ArrayList<Dwarf> alvos) {
          this.estrategia.atacar(buscar(Status.VIVO), alvos);
    }

    public ArrayList<Elfo> getOrdemDoUltimoAtaque() {
        return this.estrategia.getOrdemDoUltimoAtaque();
    }

    public void mudarEstrategia(EstrategiaDeAtaque estrategia) {
        this.estrategia = estrategia;
    }
}
