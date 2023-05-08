import java.util.ArrayList;

public class PasswordVerify {
    public static PasswordResult validaPassword(String password) {
        String msg = "";
        boolean isValid = false;

        if (!validaLongitud(password)) {
            msg += "La contrasenya ha de tenir almenys 8 caràcters";
        } else {
            isValid = true;
        }

        if (!validaNumeros(password)) {
            msg += "La contrasenya ha de contenir almenys 2 números";
        } else {
            isValid = true;
        }

        if (!validaEspeciales(password)) {
            msg += "La contrasenya ha de contenir almenys un caràcter especial";
        } else {
            isValid = true;
        }

        if (!validaMayuscula(password)) {
            msg += "La contrasenya ha de contenir almenys una lletra majuscula";
        } else {
            isValid = true;
        }

        return new PasswordResult(isValid, msg);
    }

    public static boolean validaLongitud(String contrasenya) {
        return contrasenya.length() >= 8;
    }

    public static boolean validaNumeros(String contrasenya) {
        int contNumeros = 0;
        boolean esValida = false;
        for (int i = 0; i < contrasenya.length(); i++) {
            Character caracter = contrasenya.charAt(i);
            if (Character.isDigit(caracter)) {
                contNumeros++;
            }
        }

        if (contNumeros >= 2) {
            esValida = true;
        }
        return esValida;
    }

    public static boolean validaEspeciales(String password) {
        int contNumeros = 0;
        int caracteresEspeciales = 0;
        boolean esValida = false;
        for (int i = 0; i < password.length(); i++) {
            Character caracter = password.charAt(i);
            if (Character.isDigit(caracter)) {
                contNumeros++;
            } else if (!Character.isLetterOrDigit(caracter)) {
                caracteresEspeciales++;
            }
        }

        if (caracteresEspeciales >= 1) {
            esValida = true;
        }
        return esValida;
    }

    public static boolean validaMayuscula(String password){
        return password.matches(".*[A-Z].*");
    }

}
