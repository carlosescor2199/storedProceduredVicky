package controller;

import model.Empleado;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static connection.singleton.singletonConnection.getInstance;

public class EmpleadoController {

    private EmpleadoController() {
    }

    public static Empleado getEmpleado(int id) {
        Empleado empleado = null;
        try{
            PreparedStatement ps = getInstance().prepareStatement("call consultarEmpleados(?)");
            ps.setInt(1, id);
            ResultSet res = ps.executeQuery();
            if(res.next()){
                empleado = new Empleado(res.getString(1), res.getString(2));
            }
        } catch (SQLException ex) {
            System.err.println("Error al consultar en la base de datos - Descripción del error: " + ex.getMessage());
        }
        return empleado;
    }

    public static void crearEmpleado(Empleado empleado) {
        try{
            PreparedStatement ps = getInstance().prepareStatement("call crearEmpleados(?, ?)");
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApellido());
            ps.execute();
        } catch (SQLException ex) {
            System.err.println("Error al consultar en la base de datos - Descripción del error: " + ex.getMessage());
        }
    }
}
