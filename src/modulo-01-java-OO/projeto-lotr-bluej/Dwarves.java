public class Dwarves{
    private int vida, experiencia = 0;;
    private String nome;
    private Status status = Status.VIVO;
    private Inventario inventario = new Inventario();
    private DataTerceiraEra dataNascimento;
    public Dwarves(String nome){
        this.vida = 110;
        this.nome = nome;
        this.dataNascimento = new DataTerceiraEra(1,1,1);
    }
    public Dwarves(String nome, DataTerceiraEra dataNascimento){
        this(nome);
        this.dataNascimento = dataNascimento;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public int getExperiencia(){
        return this.experiencia;
    }
    public int getVida(){
        return this.vida;
    }
    public Status getStatus(){
        return this.status;
    }
    public Inventario getInventario(){
        return this.inventario;
    }
    public DataTerceiraEra getDataNacimento(){
        return this.dataNascimento;
    }
    public void perdeVida(){
        if(getNumeroSorte() < 0)
            experiencia = experiencia + 2;
        else if(getNumeroSorte() > 100){
            int vidaAposFlechada = this.vida -10;
            if (vidaAposFlechada == 0) 
               status = Status.MORTO;
            if (vida > 0)
               vida =  vidaAposFlechada;        
        }
    }
    public void adicionarItem(Item item){
        this.inventario.adicionarItem(item);
    }
    public void perderItem(Item item){
        this.inventario.removerItem(item);
    }
    public double getNumeroSorte(){
        double numeroDaSorte = 101.0;
        if (dataNascimento.ehBissexto() && (vida >= 80 && vida <= 90)){
            numeroDaSorte = numeroDaSorte * -33;
            return numeroDaSorte;
        }
        else if (!dataNascimento.ehBissexto() && (nome == "Seixas" || nome == "Meireles")){
            numeroDaSorte = (numeroDaSorte * 33) % 100;
            return numeroDaSorte;
        }
        return numeroDaSorte;
    }
  
}
