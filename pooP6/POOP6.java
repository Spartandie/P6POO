/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooP6;

/**
 *Clase POOP6
 * @author Monroy Salazar Diego Gustavo
 */
public class POOP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(6.0);
    
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        System.out.println("Perimetro c1 = "+c1.perimetro());
        System.out.println("Area del c1 = "+c1.area());
        
        System.out.println("Perimetro c2 = "+c2.perimetro());
        System.out.println("Area del c2 = "+c2.area());
        
        System.out.println("*********");
        
        c1.setRadio(9.0);
        System.out.println("");
        System.out.println("Perimetro c1 = "+c1.perimetro());
        System.out.println("Area del c1 = "+c1.area());
        
        System.out.println("***********");
        
        Persona amigo = new Persona ();
        Fecha fNacimiento = new Fecha(3,4 , 2002);
        amigo.setNombre("Edgar");
        amigo.setApellidos("Romero Martinez");
        amigo.setfNacimiento(fNacimiento);
        //System.out.println("Info de mi amigo: "+amigo.toString());
        System.out.println("Info de mi amigo: "+amigo);
        
        Persona amigo2 = new Persona("Raul", "Ayala Barbosa", new Fecha(20, 4, 1993));
        
        System.out.println("Info amigo 2:"+amigo2);
        
        Persona amigo3 = new Persona("Diego", "Monroy Salazar");
        
        System.out.println("Info amigo 3: "+amigo3);
        
        System.out.println("******Vector******");
        System.out.println("");
        
        System.out.println("Creando vectores 1 y 2");
        System.out.println("");
        Vector v1 = new Vector(1, 1, 1);
        System.out.println("Datos v1: "+v1);
        Vector v2 = new Vector();
        System.out.println("Datos v2:"+v2);
        v2.setX(0);
        v2.setY(2);
        v2.setZ(-1);
        System.out.println("Datos v2:"+v2);
        System.out.println("");
        
        System.out.println("Suma y resta de vector 1 y 2");
        System.out.println("");
        Vector suma = new Vector();
        suma = v1.sumaV(v1, v2);
        System.out.println("v1+v2: "+suma);
        Vector resta = new Vector();
        resta = v1.restaV(v1, v2);
        System.out.println("v1- v2: "+resta);
        System.out.println("");
        
        
        System.out.println("Modulo vector resta = "+resta.modulo());
        
    }
    
}
