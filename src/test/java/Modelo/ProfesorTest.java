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
public class ProfesorTest {
    @Test
    public void testDatosProfesorSinSalario() {
        System.out.println("Prueba del método datosPersona()");
        Profesor p = new Profesor("Laura", 321654, 5, 9, 1985, "Calle 100", 789456, "Ciencias");
        String datos = p.datosPersona();
        assertTrue(datos.contains("Laura"));
        assertTrue(datos.contains("Cédula"));
        assertTrue(datos.contains("Ciencias"));
        assertEquals(0.0, p.getSalarioFinal(), 0.01);
    }
    
}
