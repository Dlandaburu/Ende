import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCuenta {

    private static Cuenta cuenta;

    @BeforeAll
    public static void instanciacion(){
        cuenta = new Cuenta("ES20", 1000);
    }

    @Test
    public void TestNumeroCuenta(){
        Cuenta cuenta = new Cuenta("ES20", 1000);
        assertEquals("ES20", cuenta.getNumero());
    }

    @Test
    public void testIngresarDinero(){
        cuenta.ingresarDinero(300);
        assertEquals(2900, cuenta.getSaldo());
    }
}
