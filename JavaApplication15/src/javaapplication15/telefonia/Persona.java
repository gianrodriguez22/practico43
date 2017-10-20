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
public class Persona {
    private long DNI;
    private String nombre;
    public Persona(long dni, String n){
        this.DNI=dni;
        this.nombre=n;
    }
    
    public void llamarMensajear(Telefono tel, long nroDestino, String msj){}
}
