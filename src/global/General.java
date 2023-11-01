package global;

public class General {

    public static boolean isNumber (String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
    public static boolean isNumber (char str) {
        return String.valueOf(str).matches("-?\\d+(\\.\\d+)?");
    }
}
