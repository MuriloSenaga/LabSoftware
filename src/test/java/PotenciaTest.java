import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PotenciaTest {

    @Test
    public void testCalculoCorreto() {
        Potencia pot = new Potencia();
        assertEquals(8, pot.calcular(2, 3));  // 2³ = 8
    }

    @Test
    public void testCalculoErrado() {
        Potencia pot = new Potencia();
        assertEquals(10, pot.calcular(2, 3)); // esse aqui deve falhar
    }
}
