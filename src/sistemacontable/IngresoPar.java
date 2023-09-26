/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sistemacontable;

import com.toedter.calendar.JTextFieldDateEditor;
import dbconnectionQueries.Create;
import dbconnectionQueries.Select;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

/**
 * @author PC
 */
public class IngresoPar extends javax.swing.JPanel {

    // JPopupMenu para mostrar el texto completo

    private DefaultTableModel model = null;

    public boolean isNumber (String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    static class CustomComboBoxRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent (JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            String text = (String) value;
            int maxLength = 50; // Longitud máxima deseada para la vista en el combo box
            if (text.length() > maxLength) {
                text = text.substring(0, maxLength) + "..."; // Acorta el texto y agrega puntos suspensivos
            }
            return super.getListCellRendererComponent(list, text, index, isSelected, cellHasFocus);
        }
    }

    private void showTextComboBox (int maxLength) {
        new Thread(new Runnable() {
            @Override
            public void run () {
                try {
                    String selectedItem = (String) jComboSelectAccountTitle.getSelectedItem();
                    assert selectedItem != null;
                    if (selectedItem.length() > maxLength) {
                        jPopupMenu1.removeAll();
                        jPopupMenu1.add(new JLabel(selectedItem));
                        jPopupMenu1.show(jComboSelectAccountTitle, 0, jComboSelectAccountTitle.getHeight());
                    }
                } catch (Exception ignored) {
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }


    private void resetData () {

        model = new DefaultTableModel(null, new String[]{
                "Fecha", "Cuenta", "Código", "Debe", "Haber"
        }){
            @Override
            public boolean isCellEditable (int row, int column) {
                return false;
            }
        };

        jTableDaily.setModel(model);
    }

    /**
     * Creates new form IngresoPar
     */
    public IngresoPar () {
        initComponents();
        resetData();

        java.util.Date date = new java.util.Date();
        jDateChooser.setDate(date);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) jDateChooser.getDateEditor();
        editor.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDaily = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnRegistry = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jcomboSelectAccountType = new javax.swing.JComboBox<>();
        jComboSelectAccountTitle = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(213, 219, 231));
        jPanel3.setName("panelContenido"); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 0, 970, -1));

        jTableDaily.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Titulo", "Codigo", "Debe", "Haber"
            }
        ));
        jScrollPane2.setViewportView(jTableDaily);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 680, 420));

        btnCancelar.setBackground(new java.awt.Color(71, 102, 121));
        btnCancelar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 150, 40));

        btnGuardar.setBackground(new java.awt.Color(71, 102, 121));
        btnGuardar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 408, 150, 40));

        btnRegistry.setBackground(new java.awt.Color(71, 102, 121));
        btnRegistry.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRegistry.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ahorrar.png"))); // NOI18N
        btnRegistry.setText("Registrar");
        btnRegistry.setEnabled(false);
        btnRegistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistryActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegistry, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 150, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 48, 990, 10));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("REGISTRO DE PARTIDAS");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 300, -1));

        jDateChooser.setBackground(new java.awt.Color(71, 102, 121));
        jDateChooser.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, 40));

        jcomboSelectAccountType.setBackground(new java.awt.Color(71, 102, 121));
        jcomboSelectAccountType.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jcomboSelectAccountType.setForeground(new java.awt.Color(255, 255, 255));
        jcomboSelectAccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar tipo de cuenta", "Activo", "Pasivo", "Patrimonio", "Cierre" }));
        jcomboSelectAccountType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboSelectAccountTypeActionPerformed(evt);
            }
        });
        jPanel3.add(jcomboSelectAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 190, 40));

        jComboSelectAccountTitle.setBackground(new java.awt.Color(71, 102, 121));
        jComboSelectAccountTitle.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboSelectAccountTitle.setForeground(new java.awt.Color(255, 255, 255));
        jComboSelectAccountTitle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar cuenta" }));
        jComboSelectAccountTitle.setEnabled(false);
        jComboSelectAccountTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboSelectAccountTitleActionPerformed(evt);
            }
        });
        jPanel3.add(jComboSelectAccountTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 360, 40));

        jPanel2.setBackground(new java.awt.Color(213, 219, 231));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Montos");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 6, -1, 28));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Deber");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Haber");
        jPanel2.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jTextField1.setBackground(new java.awt.Color(213, 219, 231));
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dato"));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 60));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 156, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 865, 567));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed


    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistryActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistryActionPerformed
        Select s = new Select();
        DefaultTableModel myModel = (DefaultTableModel) jTableDaily.getModel();

        // Crea un formato de fecha personalizado
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd, MMMM, yyyy");

        if (jDateChooser.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Seleccione una fecha", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Formatea la fecha como una cadena en el formato deseado
        String formattedDate = dateFormat.format(jDateChooser.getDate());
        Object selectedObject = jcomboSelectAccountType.getSelectedItem();
        String selected = selectedObject.toString();
        String account = (String) jComboSelectAccountTitle.getSelectedItem();
        String code = "";
        ResultSet rs = s.getAccountCode(selected.toLowerCase(), account.toUpperCase().trim());

        String efectivo = jTextField1.getText();

        if (dateFormat.format(jDateChooser.getDate()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione una fecha", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Objects.equals(formattedDate, "") && !Objects.equals(efectivo, "")){
            try {
                while (rs.next()){
                    code = rs.getString(1);

                    Object [] nuevaFila = new Object[]{
                            formattedDate,
                            account.trim(),
                            code,
                            jRadioButton1.isSelected() ? efectivo : "0",
                            jRadioButton3.isSelected() ? efectivo : "0"
                    };

                    myModel.addRow(nuevaFila);
                    jTableDaily.setRowHeight(30);

                    /*int rowCount = model.getRowCount();
                    int colCount = model.getColumnCount();

                    if (rowCount > 0) { // Asegúrate de que haya al menos una fila en la tabla
                        // Crear un arreglo unidimensional de tipo String para almacenar los datos de la última fila
                        String[] tableData = new String[colCount];

                        for (int col = 0; col < colCount; col++) {
                            Object cellValue = model.getValueAt(rowCount - 1, col); // Obtén el valor de la última fila
                            tableData[col] = String.valueOf(cellValue);
                        }

                        // Luego, puedes enviar tableData a c.saveDaily
                        Create c = new Create();
                        c.saveDaily(tableData);
                    }*/

                    jDateChooser.setDate(null);
                    jcomboSelectAccountType.setSelectedIndex(0);
                    jComboSelectAccountTitle.setEnabled(false);
                    btnRegistry.setEnabled(false);
                }
            }catch (SQLException sqlException){
                System.out.println(sqlException.getMessage());
            }
        }else {
            JOptionPane.showMessageDialog(null,
                    "Faltan campos por llenar",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnRegistryActionPerformed

    private void jcomboSelectAccountTypeActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboSelectAccountTypeActionPerformed
        if (jcomboSelectAccountType.getSelectedIndex() != 0) {
            jComboSelectAccountTitle.setRenderer(new CustomComboBoxRenderer());
            Object selectedObject = jcomboSelectAccountType.getSelectedItem();
            String selected = selectedObject.toString();
            Select s = new Select();
            ResultSet queryResult = s.getAccounts(selected);

            // Habilita el JComboBox
            jComboSelectAccountTitle.setEnabled(true);
            // Borra los elementos existentes en el JComboBox
            jComboSelectAccountTitle.removeAllItems();

            try {
                while (queryResult.next()) {
                    // Agrega los elementos al JComboBox utilizando getString(2) para obtener el valor de la primera columna
                    String originalText = queryResult.getString(2);
                    if (queryResult.getString(1).length() == 2) {
                        originalText = "   " + originalText; // Agrega dos espacios iniciales
                        String capitalizedText = originalText.substring(0, 4).toUpperCase() + originalText.substring(4).toLowerCase();
                        jComboSelectAccountTitle.addItem(capitalizedText);
                    } else if (queryResult.getString(1).length() >= 4) {
                        originalText = "     " + originalText; // Agrega dos espacios iniciales
                        String capitalizedText = originalText.substring(0, 6).toUpperCase() + originalText.substring(6).toLowerCase();
                        jComboSelectAccountTitle.addItem(capitalizedText);
                    } else {
                        String capitalizedText = originalText.substring(0, 1).toUpperCase() + originalText.substring(1).toLowerCase();
                        jComboSelectAccountTitle.addItem(capitalizedText);
                    }
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            // Deshabilita el JComboBox y borra los elementos
            jComboSelectAccountTitle.setEnabled(false);
            jComboSelectAccountTitle.removeAllItems();
            btnRegistry.setEnabled(false);
            btnRegistry.setEnabled(false);
            jComboSelectAccountTitle.setRenderer((list, value, index, isSelected, cellHasFocus) -> null);
        }
    }//GEN-LAST:event_jcomboSelectAccountTypeActionPerformed

    private void jComboSelectAccountTitleActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboSelectAccountTitleActionPerformed
        if (jComboSelectAccountTitle.getSelectedIndex() == 0) {
            btnRegistry.setEnabled(false);
            btnRegistry.setEnabled(false);
            return;
        }
        btnRegistry.setEnabled(true);
        btnRegistry.setEnabled(true);
        showTextComboBox(50);

    }//GEN-LAST:event_jComboSelectAccountTitleActionPerformed

    private static List<String []> obtenerRegistros(JTable table){
        List<String []> lista = new ArrayList<>();

        for (int i = 0; i < table.getRowCount(); i++) {
            String [] data = new String[table.getColumnCount()];
            for (int j = 0; j < table.getColumnCount(); j++) {
                data[j] = (String) table.getValueAt(i, j);
            }
            lista.add(data);
        }
        return lista;
    }

    private double totalPorCuentas(TipoCuenta tipoCuenta, List<String[]> lista) {
        double total = 0.0;
    
        switch (tipoCuenta) {
            case DEBER:
                total = lista.stream().mapToDouble(item -> Integer.parseInt(item[3])).sum();
                break;
            case HABER:
                total = lista.stream().mapToDouble(item -> Integer.parseInt(item[4])).sum();
                break;
        }

        return total;
    }


    private double[] totalPorCuentas(List<String []> lista){
        double sum1 = 0, sum2 = 0;

        for (String[] value : lista) {
            sum1 += Double.parseDouble(value[3]);
            sum2 += Double.parseDouble(value[4]);
        }

        return new double[]{sum1, sum2};
    }

    private void btnGuardarActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (jTableDaily.getRowCount() == 0){
            return;
        }

        List<String[]> lista = obtenerRegistros(jTableDaily);
        /*for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.get(i).length; j++) {
                System.out.print(((String [])(lista.get(i)))[j] + " - ");
            }
            System.out.println();
        }*/



        double[] sumas = totalPorCuentas(lista);

        if (sumas[0] != sumas[1]){
            JOptionPane.showMessageDialog(null, "La sumatoria de las cuentas debe ser igual", "", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (String[] strings : lista) {
            new Create().saveDaily(strings);
        }

        resetData();

    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegistry;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboSelectAccountTitle;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableDaily;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jcomboSelectAccountType;
    // End of variables declaration//GEN-END:variables
}
