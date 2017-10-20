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
public class Inalambrico extends Telefono{
    private int canal;
    private double alcance;
    public Inalambrico(long n, String mo, String ma, int canal, double alc) {
        super(n, mo, ma);
        this.canal=canal;
        this.alcance=alc;
    }
    
}
