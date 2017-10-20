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
public abstract class Telefono {
    private long numero;
    private String modelo;
    private String marca;
    public Telefono(long n, String mo, String ma){
        this.numero=n;
        this.modelo=mo;
        this.marca=ma;
    }
    public void llamar(long nroDestino){}
    
    
}
