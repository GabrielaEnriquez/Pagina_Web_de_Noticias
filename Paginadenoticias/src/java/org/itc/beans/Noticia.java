/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.itc.beans;
import java.sql.Date;
/**
 *
 * @author Israel
 */
public class Noticia {
    
   private String articulo;
   private Date fecha;
   private Categoria cat;
   private Integer tituloEncabezado;
   private Integer contenidoEncabezado;

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }

    public Integer getTituloEncabezado() {
        return tituloEncabezado;
    }

    public void setTituloEncabezado(Integer tituloEncabezado) {
        this.tituloEncabezado = tituloEncabezado;
    }

    public Integer getContenidoEncabezado() {
        return contenidoEncabezado;
    }

    public void setContenidoEncabezado(Integer contenidoEncabezado) {
        this.contenidoEncabezado = contenidoEncabezado;
    }
   
}