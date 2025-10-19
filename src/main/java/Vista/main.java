/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;
import javax.swing.JOptionPane;
import Modelo.Persona;
import Modelo.Profesor;
import Modelo.Estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas Castaño
 */
public class main {

    public static void main(String[] args) {
        
        ArrayList<Profesor> profesores = new ArrayList<>();
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        boolean salir = false;
        
        do{
            String opcion = JOptionPane.showInputDialog("""
                                                        
                    MENÚ PRINCIPAL:
                    1. Agregar estudiante
                    2. Agregar profesor
                    3. Ver lista de profesores
                    4. Ver lista de estudiantes
                    5. Salir
                    
                    Ingrese una opción:
                    """);
            switch (opcion){
                case "1" ->{ 
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del telefono: "));
                    int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de nacimiento: "));
                    int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de nacimiento: "));
                    int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento: "));
                    String direccion = JOptionPane.showInputDialog("Dirección: ");
                    int tarjetaIdentidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tarjeta de identidad del estudiante: "));
                    
                    Estudiante e = new Estudiante (nombre, numero, dia, mes, año, direccion, tarjetaIdentidad);
                    
                    estudiantes.add(e);
                    
                    JOptionPane.showMessageDialog(null, "Estudiante agregado");
                    
                    
                    
                }
                case "2" -> {
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
                        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de teléfono: "));
                        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de nacimiento: "));
                        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de nacimiento: "));
                        int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento: "));
                        String direccion = JOptionPane.showInputDialog("Dirección:");
                        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del profesor: "));
                        String areaTrabajo = JOptionPane.showInputDialog("Ingrese el área de trabajo del profesor: ");

                        Profesor p = new Profesor(nombre, numero, dia, mes, año, direccion, cedula, areaTrabajo);
                        
                        profesores.add(p);

                        double salario = p.calcularSalario();
                        JOptionPane.showMessageDialog(null, "El salario final del profesor es: $" + salario);
                        JOptionPane.showMessageDialog(null, "Profesor agregado correctamente.");

                }
                case "3" -> {
                    
                    if (profesores.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay profesores registrados.");
                    } else {
                        for (int i = 0; i < profesores.size() - 1; i++) {
                            for (int j = 0; j < profesores.size() - 1 - i; j++) {
                                if (profesores.get(j).getSalarioFinal() > profesores.get(j + 1).getSalarioFinal()) {
                                    Profesor temp = profesores.get(j);
                                    profesores.set(j, profesores.get(j + 1));
                                    profesores.set(j + 1, temp);
                                }
                            }
                        }
                    String lista = "Lista de profesores por salario:\n\n";

                    for (int i = 0; i < profesores.size(); i++) {
                        Profesor p = profesores.get(i);
                        lista += p.datosPersona()+"\n";
                    }

                    JOptionPane.showMessageDialog(null, lista);
                    
                    }
                    
                }
                case "4"-> {
                    if (estudiantes.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay estudiantes registrados.");
                    } else {
                        String listaEst = "Lista de estudiantes:\n\n";
                        for (int i = 0; i < estudiantes.size(); i++) {
                            Estudiante e = estudiantes.get(i);
                            listaEst += e.toString()+"\n";
                        }
                        JOptionPane.showMessageDialog(null, listaEst);
                    }
                
                }
                case "5" -> {
                    salir = true;
                    JOptionPane.showMessageDialog(null, "Gracias por usar mi aplicación");
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Opción inválida, intente de nuevo.");
                }
            }
                    
        }while(!salir);
    }
}
