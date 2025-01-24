import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class boxVentana {
    public JPanel boxPanel;
    private JComboBox<String> comboBox1;

    public boxVentana() {

        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/tienda";
            String user = "root";
            String password = "123456";

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Se conectó a la base de datos");

            String query = "SELECT nombre_categoria FROM categorias";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Llenar el JComboBox con los resultados
            while (rs.next()) {
                String categoria = rs.getString("nombre_categoria");
                comboBox1.addItem(categoria); // Agregar cada categoría al JComboBox
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Cerrar la conexión si fue abierta
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }
}
