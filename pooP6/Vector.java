/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooP6;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *Clase vector
 * @author Monroy Salazar Diego Gustavo
 */
public class Vector {
    
    
    private float x;
    private float y;
    private float z;
    
    /**
     * Constructor vacio
     */
    public Vector(){
        
    }
    
    /**
     * Constructor con parametros
     * @param x es el elemento x del vector
     * @param y es el elemento y del vector
     * @param z es el elemento z del vector
     */
    public Vector(float x, float y, float z){
        this.x=x;
        this.y=y;
        this.z=z;

    }
    /**
     * 
     * @return  x es el elemento x del vector
     */
    public float getX() {
        return x;
    }
    /**
     * 
     * @return  y es el elemento y del vector
     */
    public float getY() {
        return y;
    }
    /**
     * 
     * @return  z es el elemento z del vector
     */
    public float getZ() {
        return z;
    }
    /**
     * 
     * @param x es el elemento x del vector
     */
    public void setX(float x) {
        this.x = x;
    }
    /**
     * 
     * @param y es el elemento y del vector
     */
    public void setY(float y) {
        this.y = y;
    }
    /**
     * 
     * @param z es el elemento z del vector
     */
    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
    
    /**
     * 
     * @param v es el primer vector
     * @param v2 es el segundo vector
     * @return suma es la suma de los vectores
     */
    Vector sumaV( Vector v, Vector v2){
 
        x = v.x+v2.x;
        y = v.y+v2.y;
        z = v.z+v2.z;
        Vector suma = new Vector(x, y, z);
        System.out.print("Vector suma ");
        suma.toString(); 
        return suma;
    }
    
    /**
     * 
     * @param v es el primer vector 
     * @param v2 es el segundo vector
     * @return resta es la resta de los vectores
     */
    Vector restaV(Vector v, Vector v2){
    
        x = v.x-v2.x;
        y = v.y-v2.y;
        z = v.z-v2.z;
        Vector resta = new Vector(x, y, z);
        System.out.print("Vector resta ");
        resta.toString(); 
        return resta;
    }
    /**
     * 
     * @return res es el modulo del vector
     */
    float modulo()
    {
        float res = (float) sqrt(pow(getX(),2)+pow(getY(),2)+pow(getZ(),2));
        return res;
    }
}
