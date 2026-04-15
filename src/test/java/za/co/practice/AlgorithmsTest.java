
package za.co.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmsTest {

    @Test
    void basicCalls(){
        assertThrows(UnsupportedOperationException.class, () -> Algorithms.q1(153));
        assertThrows(UnsupportedOperationException.class, () -> Algorithms.q5("racecar"));
        assertThrows(UnsupportedOperationException.class, () -> Algorithms.q6("()()"));
        assertThrows(UnsupportedOperationException.class, () -> Algorithms.q7("0672052354"));
        assertThrows(UnsupportedOperationException.class, () -> Algorithms.q17("123e4567-e89b-12d3-a456-426614174000"));
    }

}
