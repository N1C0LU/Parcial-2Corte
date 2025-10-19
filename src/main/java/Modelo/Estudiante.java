/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Nicolas Castaño
 */
public class Estudiante extends Persona {
    private int tarjetaIdentidad;
    
    public Estudiante (String nombre,int numero, int dia, int mes, int año, String direccion, int tarjetaIdentidad){
    super(nombre, numero, dia, mes, año, direccion);
    this.tarjetaIdentidad = tarjetaIdentidad;
    }
    
    @Override
    public String toString(){
        return datosPersona()+ "\n Tarjeta de identidad: "+tarjetaIdentidad;
    }
    
}
