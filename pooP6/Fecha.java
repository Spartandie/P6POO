/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooP6;

/**
 *Clase Fecha
 * @author Monroy Salazar Diego Gustavo
 */
class Fecha {
    
    private int dia;
    private int mes;
    private int anio;
    /**
     * Cosntructro vacio
     */
    public Fecha() {
    }
    /**
     * Valores tipo int
     * @param dia dia de nacimiento
     * @param mes mes de nacimiento
     * @param anio año de nacimiento
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    /**
     * 
     * @return dia regresa el dia de nacimiento 
     */
    public int getDia() {
        return dia;
    }
    /**
     * 
     * @return mes regresa el mes de nacimiento 
     */
    public int getMes() {
        return mes;
    }
    /**
     * 
     * @return anio regresa el año de nacimiento 
     */
    public int getAnio() {
        return anio;
    }
    /**
     * 
     * @param anio es el año de nacimiento
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * 
     * @param dia es el dia de nacimiento 
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * 
     * @param mes es el mes de nacimiento 
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
    
}
