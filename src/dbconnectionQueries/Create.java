package dbconnectionQueries;

import dbconnection.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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

}
