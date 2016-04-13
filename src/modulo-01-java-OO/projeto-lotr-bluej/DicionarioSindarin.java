import java.util.*;

public class DicionarioSindarin{
    public static void main(String[] args){
        HashMap<String,String> dicionarioSindarin = new HashMap<>();
        dicionarioSindarin.put("terra","amar");
        dicionarioSindarin.put("fogo","naur");
        dicionarioSindarin.put("vento","gwaew");
        dicionarioSindarin.put("água","nen");
        dicionarioSindarin.put("coração","gûr");
        
        String terraEmSindarin = dicionarioSindarin.get("terra");
        
        dicionarioSindarin.put("água","nîn");
        
        dicionarioSindarin.remove("água");
        
        boolean estaVazio = dicionarioSindarin.isEmpty();
        
        int tamanhoDePares = dicionarioSindarin.size();
        
        boolean contemAgua = dicionarioSindarin.containsKey("água");
        
        boolean contemNaur = dicionarioSindarin.containsValue("naur");
        
        for(String chave : dicionarioSindarin.keySet()){
            System.out.println(chave);
        }
        
        int qtdNaur = 0;
        for(String valor : dicionarioSindarin.values()){
            if (valor.equals("naur")){
                qtdNaur++;
            }
        }
        System.out.println(qtdNaur);
        qtdNaur = 0;
        for (Map.Entry<String, String> chaveValor: dicionarioSindarin.entrySet()){
            if (chaveValor.getValue().equals("naur")){
                qtdNaur++;
                System.out.println(chaveValor.getKey());
            }
        }
        
        for (Map.Entry<String, String> chaveValor: dicionarioSindarin.entrySet()){
            System.out.println("K:" + chaveValor.getKey() + "- V: " + chaveValor.getValue());
            }
        }
    }