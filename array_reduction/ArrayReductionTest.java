import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;

public class ArrayReductionTest {
    @Test
    public void testArrayReduction() throws Exception {
        ArrayReduction ar = new ArrayReduction();
        assertEquals(9, ar.reductionCost(Arrays.asList(1, 2, 3)));
        assertEquals(19, ar.reductionCost(Arrays.asList(1, 2, 3, 4)));
    }
}
