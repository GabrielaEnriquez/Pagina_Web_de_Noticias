/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.beans;

/**
 *
 * @author Joshua Sebastian
 */
public class Categoria {
 //Paso 1:
 private String idCategoria;
 private String nombreCat;

    /**
     * @return the idCategoria
     */
    public String getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * @return the nombreCat
     */
    public String getNombreCat() {
        return nombreCat;
    }

    /**
     * @param nombreCat the nombreCat to set
     */
    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }

    public Categoria(String idCategoria, String nombreCat) {
        this.idCategoria = idCategoria;
        this.nombreCat = nombreCat;
    }
    public Categoria(){
    }
 
 
 
 
}
