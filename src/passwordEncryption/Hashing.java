package passwordEncryption;

import dbconnectionQueries.Select;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

public class Hashing {

    private static final int nIterations = 10000;
    private static final int keyLength = 256;

    public static String HashPassword(String password, byte[] salt) throws NoSuchAlgorithmException, InvalidKeySpecException {

        char[] passwordChar = password.toCharArray();
        PBEKeySpec spec = new PBEKeySpec(passwordChar, salt, nIterations, keyLength);
        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        byte[] hash = skf.generateSecret(spec).getEncoded();

        return Base64.getEncoder().encodeToString(hash);
    }

    public static boolean VerifyPassword(String password, String storedPassword, byte[] salt) throws NoSuchAlgorithmException, InvalidKeySpecException {

        char[] passwordChar = password.toCharArray();

        PBEKeySpec spec = new PBEKeySpec(passwordChar, salt, nIterations, keyLength);
        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        byte[] hash = skf.generateSecret(spec).getEncoded();

        String enteredPasswordHash = Base64.getEncoder().encodeToString(hash);

        return storedPassword.equals(enteredPasswordHash);
    }

    public static byte[] generateSalt(){
        SecureRandom r = new SecureRandom();
        byte[] salt = new byte[16];
        r.nextBytes(salt);
        return salt;
    }

    public static byte[] getSalt(String username){
        Select s = new Select();
        return s.getSalt(username);
    }
}
