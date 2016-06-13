package Repositorio;
import Run.IDao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alycio
 */
import br.com.crescer.aula4.entity.Cliente;
import java.util.List;
public class ClienteDAO extends EntityDAO<Cliente> {

    public ClienteDAO() {
        super(Cliente.class);
    }
}
