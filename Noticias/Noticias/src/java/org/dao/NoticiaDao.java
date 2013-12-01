/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.beans.Noticia;
import org.utils.MybatisUtil;
/**
 *
 * @author Gabriela Enriquez
 */
public class NoticiaDao {
     private SqlSessionFactory sqlSessionFactory;

    public NoticiaDao() {
        sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
    }
     public boolean create(Noticia noticia) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.insert("Noticia.insertar",noticia);

            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en NoticiaDao>insertar" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public boolean update(Noticia noticia) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.update("Noticia.actualizar", noticia);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en NoticiaDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public boolean delect(String Articulo) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.delete("NoticiaDao.eliminar", Articulo);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en NoticiaDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }

    public List<Noticia> buscarTodos() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<Noticia> listaNoticia = session.selectList("Noticia.buscarTodos");
            return listaNoticia;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }

    }
}
