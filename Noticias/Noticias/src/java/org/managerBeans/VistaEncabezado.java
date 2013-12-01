/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.managerBeans;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.beans.Encabezado;
import org.dao.EncabezadoDao;
/**
 *
 * @author Gabriela Enriquez
 */
@ManagedBean(name="Encabezado")
@SessionScoped
public class VistaEncabezado {
    public List<Encabezado> getlistaEncabezado() {  
        EncabezadoDao encabezadodao= new EncabezadoDao();    
        return encabezadodao.buscarTodos();  
    }
    
}
