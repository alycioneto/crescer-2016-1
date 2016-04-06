public class CestoDeLembas{
    private int lembas;
    private int personagens;
    public CestoDeLembas(int lembas,int personagens){
        this.lembas = lembas;
        this.personagens = personagens;
    }
    public boolean podeDividirEmPares(){
        if(personagens >= 1 && personagens <= 100){
            if (lembas % personagens == 0 && lembas != personagens && lembas % 2 == 0)
                return true;
        }  
     return false;
    }

}
