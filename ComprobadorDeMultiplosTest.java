import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComprobadorDeMultiplosTest
{
    @Test
    public void testMetodo01()
    {
        ComprobadorDeMultiplos comprobador = new ComprobadorDeMultiplos();
        assertEquals(true, comprobador.esMultiploDe2(2));
        assertEquals(false, comprobador.esMultiploDe2(0));
        assertEquals(false, comprobador.esMultiploDe2(1));
        assertEquals(false, comprobador.esMultiploDe2(-3));
        assertEquals(false, comprobador.esMultiploDe2(-5));
        assertEquals(false, comprobador.esMultiploDe2(3));
        assertEquals(true, comprobador.esMultiploDe2(4));
        assertEquals(false, comprobador.esMultiploDe2(7));
        assertEquals(true, comprobador.esMultiploDe2(8));
        assertEquals(false, comprobador.esMultiploDe2(17));
        assertEquals(true, comprobador.esMultiploDe2(16));
        assertEquals(false, comprobador.esMultiploDe2(5));
        assertEquals(true, comprobador.esMultiploDe2(10));
        assertEquals(false, comprobador.esMultiploDe2(9));
        assertEquals(true, comprobador.esMultiploDe2(28));
        assertEquals(false, comprobador.esMultiploDe2(37));
        assertEquals(true, comprobador.esMultiploDe2(48));        
    }
    
    @Test
    public void testMetodo02()
    {
        ComprobadorDeMultiplos comprobador = new ComprobadorDeMultiplos();
        assertEquals(true, comprobador.esMultiploDe5(5));
        assertEquals(false, comprobador.esMultiploDe5(4));
        assertEquals(false, comprobador.esMultiploDe5(3));
        assertEquals(false, comprobador.esMultiploDe5(2));
        assertEquals(false, comprobador.esMultiploDe5(1));
        assertEquals(false, comprobador.esMultiploDe5(0));
        assertEquals(false, comprobador.esMultiploDe5(-3));
        assertEquals(false, comprobador.esMultiploDe5(-5));
        assertEquals(false, comprobador.esMultiploDe5(8));
        assertEquals(true, comprobador.esMultiploDe5(10));
        assertEquals(false, comprobador.esMultiploDe5(12));
        assertEquals(true, comprobador.esMultiploDe5(15));
        assertEquals(false, comprobador.esMultiploDe5(17));
        assertEquals(true, comprobador.esMultiploDe5(20));
        assertEquals(false, comprobador.esMultiploDe5(23));
        assertEquals(true, comprobador.esMultiploDe5(25));
        assertEquals(false, comprobador.esMultiploDe5(29));
        assertEquals(true, comprobador.esMultiploDe5(30));
        assertEquals(false, comprobador.esMultiploDe5(37));
        assertEquals(true, comprobador.esMultiploDe5(40));        
    }  
    
    @Test
    public void testMetodo03()
    {
        ComprobadorDeMultiplos comprobador = new ComprobadorDeMultiplos();
        assertEquals(false, comprobador.esMultiploDe(-2, -3));
        assertEquals(false, comprobador.esMultiploDe(-2, 0));
        assertEquals(false, comprobador.esMultiploDe(0, -5));
        assertEquals(false, comprobador.esMultiploDe(0, 0));
        assertEquals(false, comprobador.esMultiploDe(1, 0));
        assertEquals(false, comprobador.esMultiploDe(0, 1));
        assertEquals(false, comprobador.esMultiploDe(1, 3));
        assertEquals(false, comprobador.esMultiploDe(4, 10));
        assertEquals(true, comprobador.esMultiploDe(5, 5));
        assertEquals(true, comprobador.esMultiploDe(10, 5));
        assertEquals(false, comprobador.esMultiploDe(12, 5));
        assertEquals(true, comprobador.esMultiploDe(14, 14));
        assertEquals(false, comprobador.esMultiploDe(17, 2));
        assertEquals(true, comprobador.esMultiploDe(20, 4));
        assertEquals(false, comprobador.esMultiploDe(23, 4));
        assertEquals(true, comprobador.esMultiploDe(25, 5));
        assertEquals(false, comprobador.esMultiploDe(29, 2));
        assertEquals(true, comprobador.esMultiploDe(30, 6));
        assertEquals(false, comprobador.esMultiploDe(37, 2));
        assertEquals(true, comprobador.esMultiploDe(40, 8));        
    }     
}