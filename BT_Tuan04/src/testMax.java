import junit.framework.TestCase;
import org.junit.Test;



public class testMax extends TestCase {
    @Test
    public void testTwoNegative(){
        assertTrue(Max.max(-2, -1 == -1));
    }
    @Test
    public void testTwoPositive(){
        assertEquals(Max.max(1,2), 2);
    }
    @Test
    public void testNegativePositive(){
        assertFalse(Max.max(-1, 2) == -1);
    }

}
