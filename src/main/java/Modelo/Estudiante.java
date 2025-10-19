/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Nicolas Castaño
 */
public class Estudiante {
    private String nombre;
    private int numero;
    private int dia;
    private int mes;
    private int año;
    private String direccion;
    
    public Estudiante (String nombre,int numero, int dia, int mes, int año, String direccion ){
        this.nombre = nombre;
        this.numero = numero;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.direccion = direccion;
    }
    
    
    public String datosPersona (){
        return "Nombre: " +nombre+ "\n Número de teléfono: " +numero+ "\n Fecha de nacimiento: "+dia+"/"+mes+"/"+año+ "\n Dirección: "+direccion;
    }
    
    @Override
    public String toString(){
        return datosPersona();
    }

    
    
}
