/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import Run.IDao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Alycio
 */

//https://rodrigouchoa.wordpress.com/2014/09/26/exemplo-dao-generico/
public class EntityDAO<G> implements IDao<G>{
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRESCER16");
    private static final EntityManager em = emf.createEntityManager();
    private final Class<G> classe;
    private final EntityTransaction transaction;
    
    public EntityDAO(Class<G> classe) {
        this.classe = classe;
        this.transaction = em.getTransaction();
    }

    @Override
    public void delete(G entity) {
        transaction.begin();
        em.remove(entity);
        transaction.commit();
    }

    @Override
    public void insert(G entity) {   
        transaction.begin();
        em.persist(entity);
        transaction.commit();    
    }

    @Override
    public void update(G entity) {
       transaction.begin();
        em.merge(entity);
        transaction.commit();
    }

    @Override
    public List<G> listAll() {
        Session session = em.unwrap(Session.class);
        Criteria criteria = session.createCriteria(classe.getClass());
        return criteria.list();
    }
    
}
