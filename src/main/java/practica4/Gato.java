/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

/**
 *
 * @author Juan Llado
 */
public class Gato extends Mascota {
    
    private String color;
    private Adulto dueño;

    public Gato(String color, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
    }

    public Gato() {
    }

    /**
     * 
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 
     * @param color: nuevo valor del atributo
     */
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Gato{" + "color=" + color + '}';
    }
    
    /**
     * 
     */
    @Override
    public void sonido(){
        System.out.println(this.getNombre() + " dice miau");
    }  
   
}
