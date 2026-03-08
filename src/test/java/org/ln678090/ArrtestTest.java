package org.ln678090;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrtestTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sum1() {
        int[] arr ={1,2,3,4,5};
        Arrtest at = new Arrtest();
        assertEquals(2, at.sum(arr));
    }
    @Test
    void sum2() {
        int[] arr ={1,3,5};
        Arrtest at = new Arrtest();
        assertEquals(0, at.sum(arr));
    }
    @Test
    void sum3() {
        int[] arr ={2,4,6};
        Arrtest at = new Arrtest();
        assertEquals(3, at.sum(arr));
    }
}