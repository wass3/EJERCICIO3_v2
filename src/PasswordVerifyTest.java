import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

class PasswordVerifyTest {

    @Test
    public void test1(){
        String contrasenya = "";
        PasswordResult resultadoEsperado = new PasswordResult(false, "La contrasenya ha de tenir almenys 8 caracters\n" +
                "La contrasenya ha de contenir almenys 2 numeros\n" +
                "La contrasenya ha de contenir almenys una lletra majuscula\n" +
                "La contrasenya ha de contenir almenys un caracter especial\n");
        PasswordResult resultadoReal = PasswordVerify.validaContrasenya(contrasenya);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test2(){
        String contrasenya = "hola";
        PasswordResult resultadoEsperado = new PasswordResult(false, "La contrasenya ha de tenir almenys 8 caracters\n" +
                "La contrasenya ha de contenir almenys 2 numeros\n" +
                "La contrasenya ha de contenir almenys una lletra majuscula\n" +
                "La contrasenya ha de contenir almenys un caracter especial\n");
        PasswordResult resultadoReal = PasswordVerify.validaContrasenya(contrasenya);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test3(){
        String contrasenya = "holacaracola";
        PasswordResult resultadoEsperado = new PasswordResult(false, "La contrasenya ha de contenir almenys 2 numeros\n" +
                "La contrasenya ha de contenir almenys una lletra majuscula\n" +
                "La contrasenya ha de contenir almenys un caracter especial\n");
        PasswordResult resultadoReal = PasswordVerify.validaContrasenya(contrasenya);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test4(){
        String contrasenya = "hola12";
        PasswordResult resultadoEsperado = new PasswordResult(false, "La contrasenya ha de tenir almenys 8 caracters\n" +
                "La contrasenya ha de contenir almenys una lletra majuscula\n" +
                "La contrasenya ha de contenir almenys un caracter especial\n");
        PasswordResult resultadoReal = PasswordVerify.validaContrasenya(contrasenya);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test5(){
        String contrasenya = "holaA";
        PasswordResult resultadoEsperado = new PasswordResult(false, "La contrasenya ha de tenir almenys 8 caracters\n" +
                "La contrasenya ha de contenir almenys 2 numeros\n" +
                "La contrasenya ha de contenir almenys un caracter especial\n");
        PasswordResult resultadoReal = PasswordVerify.validaContrasenya(contrasenya);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test6(){
        String contrasenya = "hola!";
        PasswordResult resultadoEsperado = new PasswordResult(false, "La contrasenya ha de tenir almenys 8 caracters\n" +
                "La contrasenya ha de contenir almenys 2 numeros\n" +
                "La contrasenya ha de contenir almenys una lletra majuscula\n");
        PasswordResult resultadoReal = PasswordVerify.validaContrasenya(contrasenya);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test7(){
        String contrasenya = "holA!";
        PasswordResult resultadoEsperado = new PasswordResult(false, "La contrasenya ha de tenir almenys 8 caracters\n" +
                "La contrasenya ha de contenir almenys 2 numeros\n");
        PasswordResult resultadoReal = PasswordVerify.validaContrasenya(contrasenya);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test8(){
        String contrasenya = "hola12!";
        PasswordResult resultadoEsperado = new PasswordResult(false, "La contrasenya ha de tenir almenys 8 caracters\n" +
                "La contrasenya ha de contenir almenys 2 numeros\n" +
                "La contrasenya ha de contenir almenys una lletra majuscula\n" +
                "La contrasenya ha de contenir almenys un caracter especial\n");
        PasswordResult resultadoReal = PasswordVerify.validaContrasenya(contrasenya);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test9(){
        String contrasenya = "hola12A";
        PasswordResult resultadoEsperado = new PasswordResult(false, "La contrasenya ha de tenir almenys 8 caracters\n" +
                "La contrasenya ha de contenir almenys 2 numeros\n" +
                "La contrasenya ha de contenir almenys una lletra majuscula\n" +
                "La contrasenya ha de contenir almenys un caracter especial\n");
        PasswordResult resultadoReal = PasswordVerify.validaContrasenya(contrasenya);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test10(){
        String contrasenya = "holacaracola12";
        PasswordResult resultadoEsperado = new PasswordResult(false, "La contrasenya ha de tenir almenys 8 caracters\n" +
                "La contrasenya ha de contenir almenys 2 numeros\n" +
                "La contrasenya ha de contenir almenys una lletra majuscula\n" +
                "La contrasenya ha de contenir almenys un caracter especial\n");
        PasswordResult resultadoReal = PasswordVerify.validaContrasenya(contrasenya);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void test11(){
        String contrasenya = "holacaracola!";
        PasswordResult resultadoEsperado = new PasswordResult(false, "La contrasenya ha de tenir almenys 8 caracters\n" +
                "La contrasenya ha de contenir almenys 2 numeros\n" +
                "La contrasenya ha de contenir almenys una lletra majuscula\n" +
                "La contrasenya ha de contenir almenys un caracter especial\n");
        PasswordResult resultadoReal = PasswordVerify.validaContrasenya(contrasenya);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    public void test12(){
        String contrasenya = "holacaracolA";
        PasswordResult resultadoEsperado = new PasswordResult(false, "La contrasenya ha de tenir almenys 8 caracters\n" +
                "La contrasenya ha de contenir almenys 2 numeros\n" +
                "La contrasenya ha de contenir almenys una lletra majuscula\n" +
                "La contrasenya ha de contenir almenys un caracter especial\n");
        PasswordResult resultadoReal = PasswordVerify.validaContrasenya(contrasenya);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}