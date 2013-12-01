/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.beans.Encabezado;
import org.utils.MybatisUtil;
/**
 *
 * @author Gabriela Enriquez
 */
public class EncabezadoDao {
     private SqlSessionFactory sqlSessionFactory;

    public EncabezadoDao() {
        sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
    }
     public boolean create(Encabezado encabezado) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.insert("Categoria.insertar", encabezado);

            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en EncabezadoDao>insertar" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public boolean update(Encabezado encabezado) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.update("Encabezado.actualizar", encabezado);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en Encabezado>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public boolean delect(String Titulo) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.delete("Encabezado.eliminar", Titulo);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en EncabezadoDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public List<Encabezado> buscarTodos() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<Encabezado> listaEncabezado = session.selectList("Encabezado.buscarTodos");
            return listaEncabezado;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }

    }
}
