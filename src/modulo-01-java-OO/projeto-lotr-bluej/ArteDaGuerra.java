import java.util.*;
public class ArteDaGuerra implements EstrategiaDeAtaque{
    private ArrayList<Elfo> ordemDoUltimoAtaque;
    public ArrayList<Elfo> getOrdemDoUltimoAtaque(){
        return this.ordemDoUltimoAtaque;
    }
    public void atacar(ArrayList<Elfo> pelotao, ArrayList<Dwarf> dwarves){
        ordemDoUltimoAtaque = new ArrayList<>(); 
        int elfosNoturnosPodemAtacar =  (int)(pelotao.size() * dwarves.size() * 0.3);
        int ataquesElfosNoturnos = 0;
        for(Elfo elfo : pelotao){
            for(Dwarf dwarf: dwarves){
                if (elfo instanceof ElfoNoturno && ataquesElfosNoturnos < elfosNoturnosPodemAtacar){
                    ataquesElfosNoturnos++;
                    elfo.atirarFlecha(dwarf);
                    this.ordemDoUltimoAtaque.add(elfo);
                }
                else if(elfo instanceof ElfoVerde  && ordemDoUltimoAtaque.size() != dwarves.size()){
                    elfo.atirarFlecha(dwarf);
                    this.ordemDoUltimoAtaque.add(elfo);
                }
            }
        }
    }
} 
