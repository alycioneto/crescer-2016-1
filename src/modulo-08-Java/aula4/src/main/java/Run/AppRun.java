/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;
import br.com.crescer.aula4.entity.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author alycio.neto
 */
public class AppRun {
    // Criando um EntityManager
    static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRESCER16");
    static final EntityManager em = emf.createEntityManager();
    
    public static void main(String[] args) {
        System.out.println(em.isOpen());
        //Pessoa pessoa = em.find(Pessoa.class, 1l);
        //System.out.println(pessoa.getNmPessoa());
        //Pessoa pessoaNova = new Pessoa();
       // pessoaNova.setNmPessoa("NovoTeste");
        //em.getTransaction().begin();
        //em.persist(pessoaNova);
        //em.getTransaction().commit();
        //Query query = em.createQuery("SELECT p FROM Pessoa p");
        //List<Pessoa> pessoas = query.getResultList();
        //for (Pessoa pessoa1 : pessoas) {
        //    System.out.println(pessoa1.getNmPessoa());
        //}
        em.close();
        emf.close();
    }
    
}
