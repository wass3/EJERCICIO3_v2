import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordVerifyTest {

    @Test
    public void test1(){
        String contraseña = "";
        PasswordResult resultadoEsperado = new PasswordResult(false, "La contraseña tiene que tener al menos 8" +
                "caracteresLa contraseña tiene que contener al menos 2 númerosLa contraseña tiene que" +
                "contener al menos una letra mayúsculaLa contraseña tiene que contener al menos un" +
                "carácter especial");
        PasswordResult resultadoReal = VerificaContrasenya.validaContrasenya(contraseña);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}