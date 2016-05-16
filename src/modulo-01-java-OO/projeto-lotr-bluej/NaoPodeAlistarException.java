public class NaoPodeAlistarException extends Exception
{
    public NaoPodeAlistarException(){
        super("Elfo do tipo normal nao pode ser alistado no Exercito");
    }
    public NaoPodeAlistarException(String nome){
        super(nome);
    }
}
