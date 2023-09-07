package dbconnectionQueries;

import dbconnection.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginQuery {

    public static boolean ValidateLogin(String username, String password){
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        boolean loginSuccess = false;

        String myQuery = "SELECT username, password FROM users WHERE username = ? AND password = ?";
        try {
            connection = DatabaseConnection.getInstance().getConnection();
            statement =  connection.prepareStatement(myQuery);
            statement.setString(1, username);
            statement.setString(2, password);

            rs = statement.executeQuery();

            if(rs.next())
                loginSuccess = true;
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return loginSuccess;
    }
}
