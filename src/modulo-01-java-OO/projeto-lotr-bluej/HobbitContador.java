import java.util.*;
public class HobbitContador
{
   public int calcularDiferenca(ArrayList<ArrayList<Integer>> arrayDePares){
       int somaDifDoProdEMMC =0;
       for (int i = 1; i <= arrayDePares.size(); i++){
           int auxI = i -1;
           int produto = arrayDePares.get(auxI).get(0) * arrayDePares.get(auxI).get(1);
           int mmc = minimoMultiploComum(arrayDePares.get(auxI).get(0),arrayDePares.get(auxI).get(1));
           somaDifDoProdEMMC = somaDifDoProdEMMC + (produto-mmc);
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
}  


