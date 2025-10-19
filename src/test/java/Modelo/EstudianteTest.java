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
public class EstudianteTest {
     @Test
    public void testCreacionEstudiante() {
        System.out.println("Prueba de creación de un Estudiante");
        Estudiante e = new Estudiante("Sofía", 123456, 1, 5, 2008, "Carrera 5 #8-20", 98765);
        String salida = e.toString();
        assertTrue(salida.contains("Sofía"));
        assertTrue(salida.contains("98765"));
    }
    
}
