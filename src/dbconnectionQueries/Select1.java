package dbconnectionQueries;


import dbconnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select1 {

    Connection connection = null;
    PreparedStatement preparedStatement = null;

    private void resetearValores(){
        connection = DatabaseConnection.getInstance().getConnection();
        preparedStatement = null;
    }
    public ResultSet obtenerNombresCuentas(){
        resetearValores();

        try {
            String myQuery ="SELECT DISTINCT cuenta from tbl_dailybook";

            preparedStatement = connection.prepareStatement(myQuery);
            return  preparedStatement.executeQuery();
        }catch (Exception ignored){
            throw new RuntimeException();
        }
    }

    public ResultSet obtenerDeberHaberPorCuenta(String nombreCuenta){
        resetearValores();
        try {
            String myQuery = "SELECT debe, haber FROM tbl_dailybook WHERE (debe <> '0' OR haber <> '0') AND cuenta = '" + nombreCuenta + "'";
            preparedStatement = connection.prepareStatement(myQuery);
            return preparedStatement.executeQuery();
        }catch (Exception ignored){
            throw new RuntimeException();
        }
    }
}
