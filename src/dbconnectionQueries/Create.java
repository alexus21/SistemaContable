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

        String myQuery = "INSERT INTO \"tbl_dailyBook\"(" +
                "fecha, " +
                "cuenta, " +
                "descripcion," +
                "parcial," +
                "debe, " +
                "haber) VALUES(?, ?, ?, ?, ?, ?)";

        try {
            connection = DatabaseConnection.getInstance().getConnection();
            statement = connection.prepareStatement(myQuery);

            int j = 0;

            for (String row : rows) {
                j++;
                statement.setString(j, row);
            }

            rs = statement.executeQuery();
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(rs != null){
                try{
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

          /*  if(statement != null){
                try{
                  //  statement.close();
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
            if(connection != null){
                try{
                   // connection.close();
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }*/
        }
    }

}
