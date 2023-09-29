package sistemacontable;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class RenderGeneralBookColourResults extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Obtener el valor de la celda "Balance"
        double balance = (double) value;

        // Establecer el color de fondo en función del valor de "Balance"
        if (balance < 0) {
            c.setForeground(new Color(190, 64, 43));
        } else {
            c.setForeground(new Color(43, 190, 138));
        }

        return c;
    }
}
