import java.util.ArrayList;

public class PasswordVerify {
    public static PasswordResult validaContrasenya(String contrasenya) {
        boolean esValido = true;
        String msg = "";

        if (!validaLongitud(contrasenya)) {
            msg += "La contrasenya ha de tenir almenys 8 caracters\n";
            esValido = false;
        }

        if (!validaDosNums(contrasenya)) {
            msg += "La contrasenya ha de contenir almenys 2 numeros\n";
            esValido = false;
        }

        if (!validaMayusculas(contrasenya)) {
            msg += "La contrasenya ha de contenir almenys una lletra majuscula\n";
            esValido = false;
        }

        if (!validaCaracEspeciales(contrasenya)) {
            msg += "La contrasenya ha de contenir almenys un caracter especial\n";
            esValido = false;
        }


        return new PasswordResult(esValido, msg);
    }

    public static boolean validaLongitud(String contrasenya) {
        return contrasenya.length() >= 8;
    }

    public static boolean validaDosNums(String contrasenya) {
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

    public static boolean validaCaracEspeciales(String contrasenya) {
        int contNumeros = 0;
        int caracteresEspeciales = 0;
        boolean esValida = false;
        for (int i = 0; i < contrasenya.length(); i++) {
            Character caracter = contrasenya.charAt(i);
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

    public static boolean validaMayusculas(String contrasenya){
        return contrasenya.matches(".*[A-Z].*");
    }



}
