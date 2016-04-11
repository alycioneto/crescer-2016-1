import java.util.*;
public class HobbitContador
{
   public int calcularDiferenca(ArrayList<ArrayList<Integer>> arrayDePares){
       int somaDifDoProdEMMC =0;
       ArrayList<Integer> controlador;
       if(!arrayDePares.isEmpty()){
           for (int i = 1; i <= arrayDePares.size(); i++){
               int auxI = i -1;
               controlador = arrayDePares.get(auxI);
               int produto = controlador.get(0) * controlador.get(1);
               int mmc = minimoMultiploComum(controlador.get(0),controlador.get(1));
               somaDifDoProdEMMC += (produto-mmc);
            }
        }
       return somaDifDoProdEMMC;    
   }
   public int minimoMultiploComum(int numA, int numB){
       int multNumA = 1,multNumB = 1;
        for (int n = 1;; n++) {
            multNumA = numA * n;
            for (int x = 1; multNumB < multNumA; x++) {
                multNumB = numB * x;
            }
            if (multNumA == multNumB)
                break;
        }
        return multNumA;
    } 
   public int obterMaiorMultiploDeTresAte(int numero) {
       // ArrayList Desncessario, variavel Limite não existe, seria Numero
        int multiplos = 0;
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                multiplos = i;
            }
        }
        return multiplos;
   }
   public ArrayList<Integer> obterMultiplosDeTresAte(int numero) {
       //Não existe a variavel Limite, break apos if e limite não existe
       ArrayList<Integer> multiplos = new ArrayList<>(Arrays.asList(0));
       int multiplo = 0;
       for (int i = 1; i <= numero; i++) {
           if (i % 3 == 0){
                multiplo = i;
                multiplos.add(multiplo);
            }
        }
       return multiplos;
   }
}  
