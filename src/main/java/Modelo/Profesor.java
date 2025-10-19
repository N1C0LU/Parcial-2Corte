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
            String horas = JOptionPane.showInputDialog("Ingrese las horas trabajadas: ");
    
            if (horas == null || horas.isEmpty()) {
                 JOptionPane.showMessageDialog(null, "No ingresó las horas trabajadas. Se asumirá 0.");
                return 0;
            }
            
            int horasTrabajadas = Integer.parseInt(horas);

            this.salarioSin = salarioHora * horasTrabajadas;
            this.salarioCon = this.salarioSin + (this.salarioSin * 0.2);
            this.salarioFinal = this.salarioCon + (this.salarioCon * 0.17);

            return this.salarioFinal;
        }
        

        @Override
        public String datosPersona(){
            return super.datosPersona() + "\n Cédula: "+cedula+ "\n Área de trabajo: "+areaTrabajo+"\n Salario de este mes: $" +salarioFinal;
        }
        
        public double getSalarioFinal() {
            return salarioFinal;
        }
        
    
    }
