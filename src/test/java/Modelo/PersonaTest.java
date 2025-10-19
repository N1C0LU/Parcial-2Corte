/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolas Castaño
 */
public class PersonaTest {
    @Test
    public void testDatosPersona() {
        System.out.println("Prueba del método datosPersona()");
        Persona persona = new Persona("Nicolás", 321456, 15, 10, 2007, "Calle 10 #15-20");
        String resultado = persona.datosPersona();
        assertTrue(resultado.contains("Nicolás"));
        assertTrue(resultado.contains("321456"));
        assertTrue(resultado.contains("15/10/2007"));
        assertTrue(resultado.contains("Calle 10 #15-20"));
    }
    
   @Test
    public void testCrearEstudianteYProfesor() {
        System.out.println("Prueba de integración: creación de Estudiante y Profesor");

        Estudiante e = new Estudiante("Diana", 123456, 20, 6, 2009, "Calle Luna", 333444);
        Profesor p = new Profesor("Carlos", 987654, 15, 3, 1980, "Calle Sol", 555777, "Física");

        assertTrue(e.toString().contains("Diana"));
        assertTrue(p.toString().contains("Carlos"));
        assertTrue(p.toString().contains("Física"));
    }
    
}
