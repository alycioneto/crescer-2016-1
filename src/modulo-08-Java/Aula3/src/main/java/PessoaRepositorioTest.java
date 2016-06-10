
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alycio.neto
 */
public class PessoaRepositorioTest {
    public static void main(String[] args) {
        PessoaRepositorio repositorio = new PessoaRepositorio();
        Pessoa testPessoa = new Pessoa(2, "Alycio");
        
        //repositorio.insert(testPessoa); -> Funcionando
        
        //repositorio.delete(testPessoa); -> Funcionando
        
        //repositorio.update(testPessoa); -> Funcionando
        
        //List<Pessoa> pessoas = repositorio.listAll();
        //for (Pessoa pessoa : pessoas) {
          //  System.out.println(pessoa.getNome());
        //}
        
        List<Pessoa> pessoasFiltradas = repositorio.findNome("Alycio");
        for (Pessoa pessoa : pessoasFiltradas) {
            System.out.println(pessoa.getNome());
        }
    }
}
