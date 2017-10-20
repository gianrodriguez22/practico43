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
public class Celular extends Telefono{
    private String empresa;
    public Celular(long n, String mo, String ma, String empresa) {
        super(n, mo, ma);
        this.empresa=empresa;
    }
    
}
