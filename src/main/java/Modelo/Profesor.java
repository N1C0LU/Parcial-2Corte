/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas Castaño
 */
public class Profesor extends Persona {
        private int cedula;
        private double salarioSin;
        private double salarioCon;
        private double salarioFinal;
        private double salarioHora = 40000;
        private String areaTrabajo;

        public Profesor (String nombre,int numero, int dia, int mes, int año, String direccion, int cedula, String areaTrabajo){
            super(nombre, numero, dia, mes, año, direccion);
            this.cedula = cedula;
            this.areaTrabajo = areaTrabajo;
        }
        
        public String getAreaTrabajo() {
            return areaTrabajo;
        }

        public void setAreaTrabajo(String areaTrabajo) {
            this.areaTrabajo = areaTrabajo;
        }


        public double calcularSalario (){ 
            int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas: "));

            salarioSin = salarioHora * horasTrabajadas;
            salarioCon = salarioSin + (salarioSin *0.2);
            salarioFinal = salarioCon + (salarioCon * 0.17); 
            
            return salarioFinal;
        }

        @Override
        public String datosPersona(){
            return super.datosPersona() + "\n Cédula: "+cedula+ "\n Área de trabajo: "+areaTrabajo+"\n Salario de este mes: $" +salarioFinal;
        }
    }
