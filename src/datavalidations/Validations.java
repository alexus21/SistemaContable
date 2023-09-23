package datavalidations;

import dbconnectionQueries.Select;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {

    public static boolean validatePasswords(String firstPassword, String secondPassword){

        if(firstPassword.isEmpty() || secondPassword.isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: ingrese las claves", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if(firstPassword.length() < 8 || secondPassword.length() < 8){
            JOptionPane.showMessageDialog(null, "Error: la clave de usuario debe tener al menos 8 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if(!firstPassword.equals(secondPassword)){
            JOptionPane.showMessageDialog(null, "Error: las claves no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    public static boolean validateUsername(String newUsername, String oldUsername){
        Select s = new Select();

        if(oldUsername.isEmpty() || newUsername.isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: ingrese los nombres de usuario", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if(s.getUsername(newUsername)){
            JOptionPane.showMessageDialog(null, "Error: este usuario ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if(!s.getUsername(oldUsername) && !oldUsername.equals("admin")){
            JOptionPane.showMessageDialog(null, "Error: usuario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if(newUsername.equalsIgnoreCase("admin")){
            JOptionPane.showMessageDialog(null, "Error: nombre de usuario no permitido", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if(newUsername.length() < 5){
            JOptionPane.showMessageDialog(null, "Error: nombre de usuario demasiado corto", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if(!checkOutUsername(newUsername)){
            JOptionPane.showMessageDialog(null, "Error: el nombre de usuario no puede contener caracteres especiales", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    private static boolean checkOutUsername(String username){
        // Regex to check valid username.
        String regex = "^[A-Za-z]\\w{5,29}$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(username);

        return m.matches();
    }
}
