package dbconnectionQueries;

import dbconnection.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
    Connection connection = null;
    PreparedStatement statement = null;


    public void ShowUsers() {
        ResultSet resultSet = null;
        try {
            // Establecer la conexión a la base de datos
            connection = DatabaseConnection.getInstance().getConnection();;

            // Consulta SQL para obtener la lista de usuarios
            String sql = "SELECT username, password FROM users";
            statement = connection.prepareStatement(sql);

            // Ejecutar la consulta
            resultSet = statement.executeQuery();

            // Iterar a través de los resultados y mostrar la lista de usuarios
            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                System.out.println("Usuario: " + username);
                System.out.println("Password: " + password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet getAccounts(String selected){
        ResultSet rs = null;
        try{
            connection = DatabaseConnection.getInstance().getConnection();
            String myQuery = "SELECT * FROM tbl_cuentasde"+selected;
            statement = connection.prepareStatement(myQuery);
            rs = statement.executeQuery();
            return rs;

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
