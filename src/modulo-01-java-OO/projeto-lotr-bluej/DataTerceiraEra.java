public class DataTerceiraEra{
    private int dia,mes,ano;
    public DataTerceiraEra(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }
    public String toString(){
        return String.format("%d/%d/%d" , this.dia, this.mes, this.ano);
    }
    public boolean ehBissexto(){
        return  ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);
    }
    public boolean equals(Object obj){
        DataTerceiraEra outro = ((DataTerceiraEra)obj);
        return this.dia == outro.getDia() && this.mes == outro.getMes() && this.ano == outro.getAno();
    }
}
