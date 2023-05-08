import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {

    @Test
    public boolean test1(){
        String contraseña = "";
        PasswordResult resultadoEsperado = new PasswordResult(false, "\"La contraseña tiene que tener al menos 8\n" +
                "caracteres\\*nLa contraseña tiene que contener al menos 2 números\\*nLa contraseña tiene que\n" +
                "contener al menos una letra mayúscula\\*nLa contraseña tiene que contener al menos un\n" +
                "carácter especial");
        PasswordResult resultadoReal = validaPassword(contraseña);
                assertEquals(resultadoEsperado, resultadoReal);
    }
}