/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import java.util.List;
import static junit.framework.Assert.fail;
import junit.framework.TestCase;
import org.beans.Categoria;

/**
 *
 * @author Joshua Sebastian
 */
public class CatalogoDaoTest extends TestCase {
    
    public CatalogoDaoTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of create method, of class CatalogoDao.
     */
//    public void testCreate() {
//        System.out.println("create");
//        Categoria categoria = new Categoria("3","Noticias2");
//        CatalogoDao instance = new CatalogoDao();
//        boolean expResult = true;
//        boolean result = instance.create(categoria);
//        //Nota:hace una comprobación!!!
//        assertEquals(expResult, result);
////         TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of update method, of class CatalogoDao.
     */
//    public void testUpdate() {
//        System.out.println("update");
//        Categoria categoria = new Categoria("1","Noticias2");
//        CatalogoDao instance = new CatalogoDao();
//        boolean expResult = true;
//        boolean result = instance.update(categoria);
//        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of delect method, of class CatalogoDao.
     */
//    public void testDelect() {
//        System.out.println("delect");
//        String idCat = "1";
//        CatalogoDao instance = new CatalogoDao();
//        boolean expResult = true;
//        boolean result = instance.delect(idCat);
//        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of buscarTodos method, of class CatalogoDao.
     */
    public void testBuscarTodos() {
        System.out.println("buscarTodos");
        CatalogoDao instance = new CatalogoDao();
        
        List<Categoria> result = instance.buscarTodos();
        //System.out.println(result.get(1).getNombreCat());      
        for(Categoria c : result){
            
            System.out.println("Nombre Categoria: "+c.getNombreCat() +" id categoria "+c.getIdCategoria());
        }
//        // TODO review the generated test code and remove the default call to fail.
        
    }
}
