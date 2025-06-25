package com.example.spro00;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JunitTest {
    @Test
    public void simpleTest() {
        int a = 2;
        int b = 3;
        assertEquals(5, a + b);
    }
}
