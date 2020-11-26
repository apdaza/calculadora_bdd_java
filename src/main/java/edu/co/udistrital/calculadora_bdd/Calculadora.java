/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.udistrital.calculadora_bdd;

/**
 *
 * @author Alejandro
 */
public class Calculadora {
    private int valor1;
    private int valor2;
    private int resultado;

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getResultado() {
        return resultado;
    }
    
    
    
    public void sumar(){
        this.resultado = this.valor1 + this.valor2;
    }
    
    public void restar(){
        this.resultado = this.valor1 - this.valor2;
        System.out.println(this.resultado);
    }
    
}
