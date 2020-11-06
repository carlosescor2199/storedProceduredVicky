package view;

import controller.EmpleadoController;
import model.Empleado;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int op = -1;
        do {
            Scanner sc = new Scanner(System.in);
            Empleado empleado = null;
            System.out.println("Menú:");
            System.out.println("1. Insertar empleado");
            System.out.println("2. Consultar empleado");
            System.out.println("0. Salir");
            System.out.print("Ingrese Opción a elegir: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Nombre del Empleado: ");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    System.out.print("Apellido del Empleado: ");
                    String apellido = sc.nextLine();
                    empleado = new Empleado(nombre, apellido);
                    EmpleadoController.crearEmpleado(empleado);
                    System.out.println("Usuario Insertado con exito");
                    break;
                case 2:
                    System.out.print("Consultar empleado - Ingrese la identificacion del empleado a buscar: ");
                    int id = sc.nextInt();
                    empleado = EmpleadoController.getEmpleado(id);
                    System.out.println("Nombre: " + empleado.getNombre() + " Apellido: " + empleado.getApellido());
                    break;
            }
        } while (op != 0);
    }
}
