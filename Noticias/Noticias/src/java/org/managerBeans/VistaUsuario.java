/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.managerBeans;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.beans.Usuario;
import org.dao.UsuarioDao;
/**
 *
 * @author Gabriela Enriquez
 */
@ManagedBean(name="Usuario")
@SessionScoped
public class VistaUsuario {
     public List<Usuario> getlistaUsuario() {  
        UsuarioDao usuariodao= new UsuarioDao();    
        return usuariodao.buscarTodos();  
    }
}
