import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PotenciaTest {

    @Test
    public void testCalculoCorreto() {
        Potencia pot = new Potencia();
        assertEquals(8, pot.potencia(2, 3));  // 2³ = 8
    }
}
