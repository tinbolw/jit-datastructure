package jit;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assume.assumeTrue;
import java.util.*;

public class Testing {
    public Jit<Integer> jit;
    public Jit<Integer> jitUno;
    public Jit<Integer> filledJit;

    @BeforeEach
    public void setup() {
        jit = new Jit<>();
        jitUno = new Jit<>();
        jitUno.jit(1);
        filledJit = new Jit<>();
        filledJit.jit(1);
        filledJit.jit(2);
        filledJit.jit(3);
        filledJit.jit(4);
    }

    @DisplayName("Test jit(), and toString")
    @Test
    public void testJitAndToString() {
        assertEquals("[1, 2, 3, 4]", filledJit.toString());
    }

    @DisplayName("Test mjacking()")
    @Test
    public void testMjacking() {
        jit.mjacking();
        jitUno.mjacking();
        filledJit.mjacking();
        
        assertEquals("[]", jit.toString());
        assertEquals("[1]", jitUno.toString());
        assertEquals("[4, 3, 2, 1]", filledJit.toString());
    }

    @DisplayName("Test size()")
    @Test
    public void testSize() {
        assertEquals(0, jit.size());
        assertEquals(1, jitUno.size());
        assertEquals(4, filledJit.size());
    }

    @DisplayName("Test compare implementation")
    @Test
    public void testCompare() {
        Set<Jit<Integer>> set = new TreeSet<>();
        set.add(jit);
        set.add(jitUno);
        set.add(filledJit);
        // some bullshit
        assertEquals(set.toArray()[0], jit);
        assertEquals(set.toArray()[1], jitUno);
        assertEquals(set.toArray()[2], filledJit);
    }
}
