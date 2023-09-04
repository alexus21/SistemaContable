package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static DatabaseConnection instance; // Instancia única
    private Connection connection; // La conexión a la base de datos

    private final String server = "jdbc:postgresql://localhost:5432/db_catalogoDeCuentas";
    private final String user = "postgres";
    private final String password = "Arbaiza044";

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private DatabaseConnection() {
        try {
            connection = DriverManager.getConnection(server, user, password);
            System.out.println("Connected!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Método estático público para acceder a la instancia única
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Método para obtener la conexión a la base de datos
    public Connection getConnection() {
        return connection;
    }
}
