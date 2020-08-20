/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estuctural;

/**
 *
 * @author richa
 */
public class TipoDocumento {
    private int codigo;
    private String siglas;
    private String descripcion;

    public TipoDocumento() {
    }

    public TipoDocumento(int codigo, String siglas, String descripcion) {
        this.codigo = codigo;
        this.siglas = siglas;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}