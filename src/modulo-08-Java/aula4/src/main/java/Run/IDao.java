/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import java.util.List;
import javax.persistence.Entity;

/**
 *
 * @author Alycio
 */
public interface IDao<G> {
    
     void insert(G entity);

    void update(G entity);

    void delete(G entity);

    List<G> listAll();
    
}
