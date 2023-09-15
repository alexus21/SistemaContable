package dbconnectionQueries;

import dbconnection.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update {
    public void updateUser(String username, String password, byte[] salt){
        Connection connection = null;
        PreparedStatement statement = null;
        String myQuery = "UPDATE users SET username = ?, password = ?, salt = ? WHERE username = ?";

        try {
            connection = DatabaseConnection.getInstance().getConnection();
            statement = connection.prepareStatement(myQuery);
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setBytes(3, salt); // Usamos setBytes para el campo salt
            statement.setString(4, username);
            statement.executeUpdate(); // Cambiamos a executeUpdate
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
