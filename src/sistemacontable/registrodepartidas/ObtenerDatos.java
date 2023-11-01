package sistemacontable.registrodepartidas;

import javax.swing.*;
import java.awt.*;

public class ObtenerDatos extends JDialog {

    public ObtenerDatos (Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        iniComponents(owner, title);
    }

    private void iniComponents(Frame owner, String title) {
        setSize(new Dimension(400, 400));
        setLocationRelativeTo(owner);
        setLayout(new GridLayout());
        setTitle(title);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(Color.WHITE);


        panelPrincipal = new JPanel(new GridLayout(3, 1));
        panelComboBox = new JPanel(new GridLayout(3, 1));
        panelText = new JPanel(new GridLayout(2, 1));
        panelButton = new JPanel(new GridLayout(3, 1));
        cmbDeberOrHaber = new JComboBox<>(new String[]{"Deber", "Haber"});
        txtDeberOrHaber = new JTextField();
        btnEnviar = new JButton("Enviar");

        cmbDeberOrHaber.addItemListener(e -> txtDeberOrHaber.setBorder(BorderFactory.createTitledBorder(String.valueOf(cmbDeberOrHaber.getSelectedItem()))));

        txtDeberOrHaber.setSize(new Dimension(txtDeberOrHaber.getPreferredSize().width, 70));
        txtDeberOrHaber.setBorder(BorderFactory.createTitledBorder(String.valueOf(cmbDeberOrHaber.getSelectedItem())));


        panelComboBox.add(cmbDeberOrHaber);
        panelText.add(txtDeberOrHaber);
        panelButton.add(btnEnviar);

        panelPrincipal.add(panelComboBox);
        panelPrincipal.add(panelText);
        panelPrincipal.add(panelButton);


        this.add(panelPrincipal);
    }

    private JPanel panelPrincipal;
    private JPanel panelComboBox;
    private JPanel panelText;
    private JPanel panelButton;
    private JTextField txtDeberOrHaber;
    private JComboBox<String> cmbDeberOrHaber;
    private JButton btnEnviar;
}