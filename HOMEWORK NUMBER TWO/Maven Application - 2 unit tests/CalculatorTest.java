package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clasa de test pentru Calculator.
 */
class CalculatorTest {
    private final Calculator calculator = new Calculator();

    /**
     * Testează metoda add() pentru a verifica dacă adună corect două numere.
     */
    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 ar trebui să fie 5");
    }

    /**
     * Testează metoda multiply() pentru a verifica dacă înmulțește corect două numere.
     */
    @Test
    void testMultiply() {
        assertEquals(10, calculator.multiply(2, 5), "2 * 5 ar trebui să fie 10");
    }
}
