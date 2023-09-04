package sistemacontable;

import dbconnection.queries.Select;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Login loginForm = new Login();
        loginForm.setVisible(true);

//        Select.ShowUsers();
    }
}
