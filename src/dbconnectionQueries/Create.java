package dbconnectionQueries;

import dbconnection.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Create {

    public void saveDaily(String[] rows){
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        String myQuery = "INSERT INTO \"tbl_dailybook\"(" +
                "fecha, " +
                "cuenta, " +
                "codigo," +
                "debe, " +
                "haber) VALUES(?, ?, ?, ?, ?)";

        try {
            connection = DatabaseConnection.getInstance().getConnection();
            statement = connection.prepareStatement(myQuery);

            int j = 0;

            for (String row : rows) {
                j++;
                statement.setString(j, row);
            }

            // Ejecutar la consulta de inserción utilizando executeUpdate
            int rowsAffected = statement.executeUpdate();
            System.out.println(rowsAffected + " filas afectadas por la inserción.");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveUser(String username, String password, byte[] salt){
        Connection connection = null;
        PreparedStatement statement = null;
        String myQuery = "INSERT INTO users(username, password, salt) VALUES (?, ?, ?)";

        try {
            connection = DatabaseConnection.getInstance().getConnection();
            statement = connection.prepareStatement(myQuery);
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setBytes(3, salt); // Usamos setBytes para el campo salt
            statement.executeUpdate(); // Cambiamos a executeUpdate
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // Cerrar la conexión, el statement y el resultSet si es necesario
        }
    }
}
