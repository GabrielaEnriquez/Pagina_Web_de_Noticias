/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.managerBeans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.beans.Categoria;
import org.dao.CatalogoDao;


/**
 *
 * @author Joshua Sebastian
 */
@ManagedBean(name="Categorias")
@SessionScoped

public class VistaCategorias {
    
    public List<Categoria> getListaCategorias() {  
        CatalogoDao catalogodao= new CatalogoDao();    
        return catalogodao.buscarTodos();  
    }
    
}
 