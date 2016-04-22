public class IrishDwarf extends Dwarf {
    public IrishDwarf(String nome){
        super(nome);
    }
    public IrishDwarf(String nome, DataTerceiraEra dataNascimento){
        super(nome,dataNascimento);
    }
    public void tentarSorte(){
        if (getNumeroSorte() == -3333.0 ){
            for(int i =1; i <= inventario.getLista().size(); i++){
                int a = i -1 ;
                int somaDeQuantidade = 0;
                for (int j = 0; j <= inventario.getLista().get(a).getQuantidade(); j++){
                    somaDeQuantidade = somaDeQuantidade + j;
                }
                inventario.getLista().get(a).aumentaQuantidadeIrishDwarf(somaDeQuantidade);
            }
        }
    }  
}
