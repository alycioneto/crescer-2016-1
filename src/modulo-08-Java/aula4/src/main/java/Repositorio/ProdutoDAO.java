package Repositorio;
import br.com.crescer.aula4.entity.Produto;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alycio
 */
public class ProdutoDAO extends EntityDAO<Produto>{

    public ProdutoDAO() {
        super(Produto.class);
    }

}