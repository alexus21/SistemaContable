package dbconnectionQueries;

import dbconnection.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Create {

    public void saveDaily(List<String[]> rows, String descripcion, String fecha){
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        String consulta = "INSERT INTO tbl_partida (fecha, descripcion) VALUES (?, ?)";

        try {
            connection = DatabaseConnection.getInstance().getConnection();
            statement = connection.prepareStatement(consulta);

            statement.setString(1, fecha);
            statement.setString(2, descripcion);

            int rowsAffecteds = statement.executeUpdate();
            System.out.println(rowsAffecteds == 1 ? "1 fila afectada" : rowsAffecteds + "filas afectadas");
            if (rowsAffecteds >= 1) {
                System.out.println("Se creó la partida");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        consulta = "SELECT * FROM tbl_partida ORDER BY idPartida DESC LIMIT 1";
        int idPartida = 0;

        try {
            connection = DatabaseConnection.getInstance().getConnection();
            statement = connection.prepareStatement(consulta);
            rs = statement.executeQuery();

            if (rs.next()) {
                idPartida = rs.getInt("idPartida");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String myQuery = "INSERT INTO \"tbl_dailybook\"(" +
                "cuenta," +
                "codigo," +
                "debe, " +
                "haber, " +
                "idpartida) VALUES(?, ?, ?, ?, ?)";

        try {
            for(String[] row: rows){

                connection = DatabaseConnection.getInstance().getConnection();
                statement = connection.prepareStatement(myQuery);
                System.out.println(row.length);

                for (int i = 0; i < row.length; i++) {
                    statement.setString(i + 1, row[i]);
                }
                statement.setInt(5, idPartida);

                // Ejecutar la consulta de inserción utilizando executeUpdate
                int rowsAffected = statement.executeUpdate();
                System.out.println(rowsAffected + " filas afectadas por la inserción.");
                statement.close();
            }
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
