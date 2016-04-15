import java.util.*;
public class ArteDaGuerra implements EstrategiaDeAtaque{
    private ArrayList<Elfo> ordemDoUltimoAtaque;
    public ArrayList<Elfo> getOrdemDoUltimoAtaque(){
        return this.ordemDoUltimoAtaque;
    }
    public void atacar(ArrayList<Elfo> pelotao, ArrayList<Dwarves> dwarves){
        double elfosNoturnosPodemAtacar =  ((int)((pelotao.size() * dwarves.size()) * 0.30));
        int elfosNoturnosPodemAtacar =  ((int)((pelotao.size() * dwarves.size()) * 0.30));
        int ataquesElfosNoturnos = 0;
        ordemDoUltimoAtaque = new ArrayList<>(); 
        for(Elfo elfo : pelotao){
            for(Dwarves dwarf: dwarves){
                if (elfo instanceof ElfoNoturno && ataquesElfosNoturnos < elfosNoturnosPodemAtacar && ordemDoUltimoAtaque.size() != dwarves.size() ){
                    ataquesElfosNoturnos++;
                    elfo.atirarFlecha(dwarf);
                    this.ordemDoUltimoAtaque.add(elfo);
                }
                else if(elfo instanceof ElfoVerde && ordemDoUltimoAtaque.size() != dwarves.size()){
                    elfo.atirarFlecha(dwarf);
                    this.ordemDoUltimoAtaque.add(elfo);
                }
            }
        }
    }
} 
