public class Dwarf extends Personagem{
    private DataTerceiraEra dataNascimento;
    public Dwarf(String nome){
        super(nome);
        this.vida = 110;
        this.dataNascimento = new DataTerceiraEra(1,1,1);
    }
    public Dwarf(String nome, DataTerceiraEra dataNascimento){
        this(nome);
        this.dataNascimento = dataNascimento;
    }
    public DataTerceiraEra getDataNacimento(){
        return this.dataNascimento;
    }
    public void perdeVida(){
        if(getNumeroSorte() < 0)
            experiencia = experiencia + 2;
        else if(getNumeroSorte() > 100){
            double vidaAposFlechada = this.vida -10;
            if (vidaAposFlechada == 0) 
               status = Status.MORTO;
            if (vida > 0)
               vida =  vidaAposFlechada;        
        }
    }
    public double getNumeroSorte(){
        double numeroDaSorte = 101.0;
        if (dataNascimento.ehBissexto() && (vida >= 80 && vida <= 90)){
            numeroDaSorte = numeroDaSorte * -33;
            return numeroDaSorte;
        }
        else if (!dataNascimento.ehBissexto()&& nome != null && (nome == "Seixas" || nome == "Meireles")){
            numeroDaSorte = (numeroDaSorte * 33) % 100;
            return numeroDaSorte;
        }
        return numeroDaSorte;
    }
    public void tentarSorte(){
        if (getNumeroSorte() == -3333.0 ){
            for(int i =1; i <= inventario.getLista().size(); i++){
                int aux = i - 1 ;
                inventario.getLista().get(aux).aumentaQuantidade();
            }
        }
    }  
    public static Dwarf descobrirMenosVida(Dwarf dwarf1, Dwarf dwarf2 ){
        return dwarf1.getVida() < dwarf2.getVida() ? dwarf1 : dwarf2;
    }
    public boolean equals(Object obj){
        Dwarf outro = ((Dwarf)obj);
        return super.equals(obj) && this.dataNascimento.equals(outro.getDataNacimento()) ;
    }
}
