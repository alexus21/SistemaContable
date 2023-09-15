/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemacontable;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Point;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Principal extends javax.swing.JFrame {
    
    //Variables a emplear para poder mover la ventana principal
    private int mouseX, mouseY;
    private int windowX, windowY;

    /**
     * Creates new form Principal
     */
    public Principal(String username) {
        initComponents();
        
       BarraTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    formMousePressed(evt);
                }
            });
        BarraTitulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                public void mouseDragged(java.awt.event.MouseEvent evt) {
                    formMouseDragged(evt);
                }
            });

        lblUsername.setText(username);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnMayor = new javax.swing.JButton();
        btnBalance = new javax.swing.JButton();
        btnDiario = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        BarraTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Container = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(39, 52, 69));
        jPanel2.setName("PanelMenu"); // NOI18N

        btnInicio.setBackground(new java.awt.Color(74, 106, 125));
        btnInicio.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hogar.png"))); // NOI18N
        btnInicio.setText("  Inicio");
        btnInicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        btnInicio.setName("btnInicio"); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnMayor.setBackground(new java.awt.Color(74, 106, 125));
        btnMayor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnMayor.setForeground(new java.awt.Color(255, 255, 255));
        btnMayor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/banco.png"))); // NOI18N
        btnMayor.setText(" Libro Mayor");
        btnMayor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        btnMayor.setName("btnLMayor"); // NOI18N
        btnMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayorActionPerformed(evt);
            }
        });

        btnBalance.setBackground(new java.awt.Color(74, 106, 125));
        btnBalance.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBalance.setForeground(new java.awt.Color(255, 255, 255));
        btnBalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/divisa.png"))); // NOI18N
        btnBalance.setText(" Balance");
        btnBalance.setActionCommand("");
        btnBalance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        btnBalance.setName("btnBalance"); // NOI18N
        btnBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceActionPerformed(evt);
            }
        });

        btnDiario.setBackground(new java.awt.Color(74, 106, 125));
        btnDiario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDiario.setForeground(new java.awt.Color(255, 255, 255));
        btnDiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario.png"))); // NOI18N
        btnDiario.setText(" Libro diario");
        btnDiario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        btnDiario.setName("btnLdiario"); // NOI18N
        btnDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiarioActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(74, 106, 125));
        btnSalir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout.png"))); // NOI18N
        btnSalir.setText(" Salir");
        btnSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        btnSalir.setName("btnSalir"); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(74, 106, 125));
        btnIngresar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnIngresar.setText(" Ingresar Partida");
        btnIngresar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        btnIngresar.setName("btnIngresarPartida"); // NOI18N
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDiario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBalance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                        .addComponent(btnMayor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 260, 580));

        BarraTitulo.setBackground(new java.awt.Color(21, 87, 145));
        BarraTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo1.png"))); // NOI18N
        BarraTitulo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FINANCE");
        BarraTitulo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 16, 90, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarioPrincipal.png"))); // NOI18N
        BarraTitulo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, -1, 50));

        lblUsername.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Usuario");
        lblUsername.setName("lblUSerName"); // NOI18N
        BarraTitulo.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 170, 30));

        btnMinimizar.setBackground(new java.awt.Color(21, 87, 145));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizar-signo.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        BarraTitulo.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 40, 30));

        jPanel1.add(BarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 50));

        jPanel4.setBackground(new java.awt.Color(213, 219, 231));
        jPanel4.setName("PanelContedor1"); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("BIENVENIDO");

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(jLabel5)
                .addContainerGap(378, Short.MAX_VALUE))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(545, 545, 545))
        );

        jPanel4.add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 580));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 870, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        //abriendo el formulario de ingreso 
        btnIngresar.setFocusPainted(false);
        Ingreso_Partidas verForm = new Ingreso_Partidas ();
        verForm.setVisible(true);
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    //Button que cierra el formulario
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Preguntando al usuario si esta seguro de salir
        int confirmation = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea cerrar el formulario?", "Cerrar Formulario", JOptionPane.YES_NO_OPTION);
        //Verificando la decision del usuario
        if(confirmation == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceActionPerformed
        btnBalance.setFocusPainted(false);
        Balance b = new Balance();
        b.setSize(870, 570);
        b.setLocation(0, 0);
        
        Container.removeAll();
        Container.add(b, BorderLayout.CENTER);
        Container.revalidate();
        Container.repaint();
    }//GEN-LAST:event_btnBalanceActionPerformed

    private void btnDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiarioActionPerformed
        btnDiario.setFocusPainted(false);
        //Instancia delpanel de libro diario
        Libro_Diario diario = new Libro_Diario();
        diario.setSize(870, 570);
        diario.setLocation(0, 0);
        
        Container.removeAll();
        Container.add(diario, BorderLayout.CENTER);
        Container.revalidate();
        Container.repaint();
    }//GEN-LAST:event_btnDiarioActionPerformed

    //Button para poder minimizar 
    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        btnInicio.setFocusPainted(false);
        Container.removeAll();
        Container.add(jLabel5, BorderLayout.CENTER);
        Container.revalidate();
        Container.repaint();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayorActionPerformed
        btnMayor.setFocusPainted(false);
        LIbroMAyor mayor = new LIbroMAyor(); 
        mayor.setSize(870, 570);
        mayor.setLocation(0, 0);
        
        Container.removeAll();
        Container.add(mayor, BorderLayout.CENTER);
        Container.revalidate();
        Container.repaint();
    }//GEN-LAST:event_btnMayorActionPerformed

      //Para poder mover la ventana Principal
       private void formMousePressed(java.awt.event.MouseEvent evt) {
       Point p = evt.getLocationOnScreen();
       mouseX = p.x - BarraTitulo.getX();
       mouseY = p.y - BarraTitulo.getY();
       windowX = getX();
       windowY = getY();
    }
        private void formMouseDragged(java.awt.event.MouseEvent evt) {
         Point p = evt.getLocationOnScreen();
         int deltaX = p.x - mouseX;
         int deltaY = p.y - mouseY;
         setLocation(windowX + deltaX, windowY + deltaY);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraTitulo;
    private javax.swing.JPanel Container;
    private javax.swing.JButton btnBalance;
    private javax.swing.JButton btnDiario;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMayor;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
