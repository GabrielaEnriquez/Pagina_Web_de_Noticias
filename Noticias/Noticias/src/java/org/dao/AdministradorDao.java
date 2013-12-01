/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.beans.Administrador;
import org.utils.MybatisUtil;
/**
 *
 * @author Gabriela Enriquez
 */
public class AdministradorDao {
     private SqlSessionFactory sqlSessionFactory;

    public AdministradorDao() {
        sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
    }
    public boolean create(Administrador administrador) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.insert("Administrador.insertar", administrador);

            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en Administrador>insertar" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public boolean update(Administrador administrador) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.update("Administrador.actualizar",administrador);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en AdministradorDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public boolean delect(String UsuarioAdmon) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.delete("Administrador.eliminar", UsuarioAdmon);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en AdministradorD>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public List<Administrador> buscarTodos() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<Administrador> listaAdministrador = session.selectList("Administrador.buscarTodos");
            return listaAdministrador;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }

    }
}
