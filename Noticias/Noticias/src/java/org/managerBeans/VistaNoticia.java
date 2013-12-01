/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.managerBeans;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.beans.Noticia;
import org.dao.NoticiaDao;
/**
 *
 * @author Gabriela Enriquez
 */
@ManagedBean(name="Noticia")
@SessionScoped
public class VistaNoticia {
      public List<Noticia> getlistaNoticia() {  
        NoticiaDao noticiadao= new NoticiaDao();    
        return noticiadao.buscarTodos(); 
}
      }
