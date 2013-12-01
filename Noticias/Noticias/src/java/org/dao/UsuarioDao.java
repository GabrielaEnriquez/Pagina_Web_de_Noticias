/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.beans.Usuario;
import org.utils.MybatisUtil;
/**
 *
 * @author Gabriela Enriquez
 */
public class UsuarioDao {
  private SqlSessionFactory sqlSessionFactory;

    public UsuarioDao() {
        sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
    } 
     public boolean create(Usuario usuario) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.insert("Usuario.insertar", usuario);

            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en UsuarioDao>insertar" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public boolean update(Usuario usuario) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.update("Usuario.actualizar", usuario);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en UsuarioDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public boolean delect(String Usuario) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.delete("Usuario.eliminar", Usuario);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en UsuarioDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public List<Usuario> buscarTodos() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<Usuario> listaUsuario = session.selectList("Usuario.buscarTodos");
            return listaUsuario;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }

    }
}
