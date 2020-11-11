/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooP6;

/**
 *Clase persona
 * @author Monroy salazar Diego Gustavo
 */
public class Persona {
    private String Nombre;
    private String Apellidos;
    private Fecha fNacimiento;
    /**
     * Constructor Persona vacio
     */
    public Persona() {
    }
    /**
     * Constructor Persona con parametros
     * @param Nombre Es el nombre de la persona
     * @param Apellidos Son los apellidos de la persona
     * @param fNacimiento es la fecha de nacimeinto de la persona
     */
    public Persona(String Nombre, String Apellidos, Fecha fNacimiento) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.fNacimiento = fNacimiento;
    }
    /**
     * ConstructorPerosna con parametros
     * @param Nombre Es el nombre de la persona
     * @param Apellidos Son los apellidos de la persona
     */
    public Persona(String Nombre, String Apellidos) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.fNacimiento = new Fecha(3, 5, 2000);
    }
    /**
     * 
     * @return Nombre es el nombre de la persona
     */
    public String getNombre() {
        return Nombre;
    }
    /**
     * 
     * @param Nombre Es el nombre de la persona
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    /**
     * 
     * @return Apellidos son los apellidos de la persona 
     */
    public String getApellidos() {
        return Apellidos;
    }
    /**
     * 
     * @param Apellidos Son los apellidos de la persona
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    /**
     * 
     * @return fNacimiento es la fecha de nacimiento de la persona
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }
    /**
     * 
     * @param fNacimiento Es la fecha de nacimiento de la persona
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", fNacimiento=" + fNacimiento + '}';
    }

    
    
    
}
