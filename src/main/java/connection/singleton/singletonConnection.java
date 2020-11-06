package connection.singleton;

import connection.BD.ConectarMySQL;

import java.sql.Connection;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Singleton que devuelve la conexion a una Base de datos
 */
public class singletonConnection {

    private static Connection connection;

    public static Connection getInstance() {

        if (connection == null) {

            try {
                Properties properties = new Properties();

                connection = new
                        ConectarMySQL()
                        .getConnection();

            } catch (Exception ex) {
                Logger.getLogger(singletonConnection.class.getName()).log(Level.SEVERE, null, ex);
            }


        }

        return connection;
    }


}