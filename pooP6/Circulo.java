/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooP6;

/**
 * Clase Circulo
 * @author Monroy Salazar Diego Gustavo
 */


public class Circulo {
    static double PI = Math.PI;
    private double radio;
    private String Color;
    
    /**
     * Constructor que no recibe valor
     */
    public Circulo() {
    }
    /**
     * Constructor que recibe un radio
     * @param radio valor de tipo double que es el radio del circulo
     */
    public Circulo(double radio) {
        this.radio = radio;
    }
    /**
     * 
     * @return radio es el radio del circulo 
     */
    public double getRadio() {
        return radio;
    }
    /**
     * 
     * @param radio radio del circulo de tipo double 
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", Color=" + Color + '}';
    }
    /**
     * 
     * @return  2*PI*radio es el perimetro del circulo
     */
    public double perimetro(){
        return 2*PI*radio;
    }
    /**
     * 
     * @return PI*radio*radio es el area del circulo
     */
    public double area()
    {
        return PI*radio*radio;
    }
    
    
}
