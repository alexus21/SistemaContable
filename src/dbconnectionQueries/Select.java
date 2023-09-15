package dbconnectionQueries;

import dbconnection.DatabaseConnection;

import java.sql.*;

public class Select {

    public void ShowUsers() {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            // Establecer la conexión a la base de datos
            connection = DatabaseConnection.getInstance().getConnection();
            ;

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

    public ResultSet getAccounts(String selected) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            connection = DatabaseConnection.getInstance().getConnection();
            String myQuery = "SELECT * FROM tbl_cuentasde" + selected;
            statement = connection.prepareStatement(myQuery);
            rs = statement.executeQuery();
            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ResultSet getAccountCode(String selected, String accountName) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            connection = DatabaseConnection.getInstance().getConnection();
            String myQuery = "SELECT codigo FROM tbl_cuentasde" + selected + " WHERE nombre = ?";
            statement = connection.prepareStatement(myQuery);
            statement.setString(1, accountName);
            rs = statement.executeQuery();
            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ResultSet loadDailyBook() {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            // Establece la conexión a la base de datos (Asegúrate de configurar correctamente los parámetros de conexión)
            connection = DatabaseConnection.getInstance().getConnection();
            // Ejecuta una consulta SQL para obtener los datos
            String myQuery = "SELECT * FROM public.\"tbl_dailybook\"";
            statement = connection.prepareStatement(myQuery);
            rs = statement.executeQuery();
            return rs;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean getUsername(String username){
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        try{
            connection = DatabaseConnection.getInstance().getConnection();
            String myQuery = "SELECT username FROM users where username = ?";
            statement = connection.prepareStatement(myQuery);
            statement.setString(1, username);
            rs = statement.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public String getStoredPassword(String username){
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        byte[] salt = new byte[0];

        try{
            connection = DatabaseConnection.getInstance().getConnection();
            String myQuery = "SELECT password FROM users where username = ?";
            statement = connection.prepareStatement(myQuery);
            statement.setString(1, username);
            rs = statement.executeQuery();
            if(rs.next()){
                return rs.getString(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "";
    }

    public byte[] getSalt(String username){
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        byte[] salt = new byte[0];

        try{
            connection = DatabaseConnection.getInstance().getConnection();
            String myQuery = "SELECT salt FROM users where username = ?";
            statement = connection.prepareStatement(myQuery);
            statement.setString(1, username);
            rs = statement.executeQuery();
            if(rs.next()){
                return rs.getBytes(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return salt;
    }
}
