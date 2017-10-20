/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15.telefonia;

/**
 *
 * @author Usuario
 */
public class Fijo extends Telefono{
    private String tipo_linea;
    public Fijo(long n, String mo, String ma, String tl) {
        super(n, mo, ma);
        this.tipo_linea=tl;
    }
    
}
