import java.util.*;
public class HobbitContador
{
   public int contador(ArrayList<ArrayList<Integer>> arrayDePares){
       int somaDifDoProdEMMC =0;
       for (int i = 1; i <= arrayDePares.size(); i++){
           int auxI = i -1;
           for(int j = 1 ; j < arrayDePares.get(auxI).size();j++){
               int auxJ = j-1;
                   int produto = arrayDePares.get(auxI).get(auxJ) * arrayDePares.get(auxI).get(auxJ+1);
                   int mmc = minimoMultiploComum(arrayDePares.get(auxI).get(auxJ),arrayDePares.get(auxI).get(auxJ +1));
                   somaDifDoProdEMMC = somaDifDoProdEMMC + (produto-mmc);
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
}  


