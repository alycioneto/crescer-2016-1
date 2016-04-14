import java.util.*;

public class DicionarioSindarin{
    public static void main(String[] args){
        //dicionarioSindarin.remove("água");
        //boolean estaVazio = dicionarioSindarin.isEmpty();
        //int tamanhoDePares = dicionarioSindarin.size();
        //boolean contemAgua = dicionarioSindarin.containsKey("água");
        //boolean contemNaur = dicionarioSindarin.containsValue("naur");
        /*
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
        }*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tradutor Sindarin");
        System.out.println("[P]ortugues [I]ngles");
        String idioma = scanner.nextLine();
        System.out.println("Qual a palavra deseja traduzir");
        String palavra = scanner.nextLine();
        TradutorSindarin tradutor = null;
        switch(idioma.toLowerCase()){
            case "i":
            tradutor = new SindarinParaIngles();
            break;
            default:
            tradutor = new SindarinParaPortugues();
            break;
        }
        if (tradutor.getDicionario().containsKey("naur"))
            System.out.println("Naur significa " + tradutor.traduzir("naur"));
    }
}