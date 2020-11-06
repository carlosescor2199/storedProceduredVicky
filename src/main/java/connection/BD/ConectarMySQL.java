package connection.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectarMySQL {

    private Connection connection;


    public ConectarMySQL() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();


            // Se crea un URL hacia la maquina y la base de datos
            String url = "jdbc:mysql://localhost:3306/pepitoplus?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

            //se crea la conexion a la base de datos
            connection = DriverManager.getConnection(url, "root", "");

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }


    public Connection getConnection() {
        return connection;
    }

    public void cerrarConexion() {

        try {

            connection.close();

        } catch (SQLException e) {


            e.printStackTrace();
        }

    }
}