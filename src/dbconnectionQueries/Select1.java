package dbconnectionQueries;


import dbconnection.DatabaseConnection;
import sistemacontable.libromayor.Mayor;

import java.sql.*;
import java.util.List;
import java.util.Queue;

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
            String myQuery ="SELECT DISTINCT cuenta, codigo from tbl_dailybook";

            preparedStatement = connection.prepareStatement(myQuery);
            return  preparedStatement.executeQuery();
        }catch (Exception ignored){
            throw new RuntimeException();
        }
    }

    public ResultSet obtenerDeberHaberPorCuenta(String nombreCuenta){
        resetearValores();
        try {
            String myQuery = "SELECT debe, haber, codigo FROM tbl_dailybook WHERE cuenta = '" + nombreCuenta + "'";
            preparedStatement = connection.prepareStatement(myQuery);
            return preparedStatement.executeQuery();
        }catch (Exception ignored){
            throw new RuntimeException();
        }
    }

    public ResultSet obtenerCodigosCuentas(String nombreCuenta){
        resetearValores();
        try {
            String myQuery = "SELECT * FROM tbl_catalogodecuentas WHERE account LIKE '" + nombreCuenta + "%'";
            preparedStatement = connection.prepareStatement(myQuery);
            return preparedStatement.executeQuery();
        } catch (Exception ignored) {
            throw new RuntimeException(ignored.getMessage());
        }
    }

    public void guardarCuentasEnLibroMayor(List<Mayor> mayor) {

        resetearValores();

        try (PreparedStatement pstmt = connection.prepareStatement("TRUNCATE tbl_libromayor")) {
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        try (PreparedStatement pstmt = connection.prepareStatement("ALTER SEQUENCE tbl_libromayor_idlibro_seq RESTART WITH 1")){
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        String myQuery = "INSERT INTO tbl_libromayor(codigo, cuenta, debe, haber) VALUES (?, ?, ?, ?)";

        if (mayor.isEmpty()) return;

        for (Mayor fila : mayor) {
            try {
                preparedStatement = connection.prepareStatement(myQuery);

                preparedStatement.setString(1, fila.getCodigo());
                preparedStatement.setString(2, fila.getCuenta());
                preparedStatement.setDouble(3, fila.getDeber());
                preparedStatement.setDouble(4, fila.getHaber());

                preparedStatement.executeUpdate();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
