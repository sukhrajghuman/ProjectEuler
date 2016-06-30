import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sghuman on 30/06/2016.
 */

public class TestProjectEuler {

    @Test
    public void testProbem1ReturnsAnswer() {
        assertEquals(233168, new Problem1().run());
    }
    
}
