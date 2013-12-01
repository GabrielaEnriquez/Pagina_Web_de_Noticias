/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.managerBeans;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.beans.Administrador;
import org.dao.AdministradorDao;
/**
 *
 * @author Gabriela Enriquez
 */
@ManagedBean(name="Administrador")
@SessionScoped
public class VistaAdministrador {
    public List<Administrador> getlistaAdministrador() {  
        AdministradorDao administradordao= new AdministradorDao();    
        return administradordao.buscarTodos();  
    }
}
