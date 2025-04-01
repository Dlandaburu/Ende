import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuentaTest {

    @Test
    void getNumero() {
        Cuenta cuenta = new Cuenta("4790021", 1300);
        assertEquals("4790021", cuenta.getNumero());
    }

    @Test
    void getSaldo() {
        Cuenta cuenta = new Cuenta("4790021", 1300);
        assertEquals(1300, cuenta.getSaldo());
    }

    @Test
    void setNumero() {
        Cuenta cuenta = new Cuenta("4790021", 1300);
        cuenta.setNumero("4790021");
        assertEquals("4790021", cuenta.getNumero());
    }

    @Test
    void setSaldo() {
        Cuenta cuenta = new Cuenta("4790021", 1300);
        cuenta.setSaldo(2500);
        assertEquals(2500, cuenta.getSaldo());
    }

    @Test
    void ingresarDinero() {
        Cuenta cuenta = new Cuenta("4790021", 1300);
        cuenta.ingresarDinero(500);
        assertEquals(1800, cuenta.getSaldo());
    }

    @Test
    void extraerDinero() {
        Cuenta cuenta = new Cuenta("4790021", 1300);
        cuenta.extraerDinero(500);
        assertEquals(800, cuenta.getSaldo());
    }

    @Test
    void mostrarCuenta() {
        Cuenta cuenta = new Cuenta("4790021", 1300);
        assertNotNull(cuenta);
    }
}