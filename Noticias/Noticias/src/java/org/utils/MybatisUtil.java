/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.utils;

import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author dw
 */

public class MybatisUtil {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            Reader reader = Resources.getResourceAsReader("BaseDatos_config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            System.out.println("Error en MybatisUtil" + e.getMessage());
        }

    }
    
      
    public static SqlSessionFactory getSqlSessionFactory(){
    
        return sqlSessionFactory;
             
    }
}
