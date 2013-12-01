/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.beans.Categoria;
import org.utils.MybatisUtil;

/**
 *
 * @author Joshua Sebastian
 */
public class CatalogoDao {

    private SqlSessionFactory sqlSessionFactory;

    public CatalogoDao() {
        sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
    }

    public boolean create(Categoria categoria) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.insert("Categoria.insertar", categoria);

            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en CategoriaDao>insertar" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public boolean update(Categoria categoria) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.update("Categoria.actualizar", categoria);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en CatalogoDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public boolean delect(String idCategoria) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.delete("Categoria.eliminar", idCategoria);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en CatalogoDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public List<Categoria> buscarTodos() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<Categoria> listaCategoria = session.selectList("Categoria.buscarTodos");
            return listaCategoria;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }

    }
}
