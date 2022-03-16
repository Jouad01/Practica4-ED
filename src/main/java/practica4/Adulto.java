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
public class Adulto extends Persona{
    private String NSS;
    private String direccion;
    private Perro perro;
    private Gato gato;
    private Barco embarcacion;
    private Niño hijo;

    public Adulto(String NSS, String direccion) {
        this.NSS = NSS;
        this.direccion = direccion;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Adulto{" + "NSS=" + NSS + ", direccion=" + direccion + '}';
    }

    public Niño getHijo() {
        return hijo;
    }

    public void setHijo(Niño hijo) {
        this.hijo = hijo;
    }
}
