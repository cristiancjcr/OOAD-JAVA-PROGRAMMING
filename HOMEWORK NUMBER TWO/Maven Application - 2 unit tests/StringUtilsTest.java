package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clasa de test pentru StringUtils.
 */
class StringUtilsTest {

    /**
     * Testează metoda reverse() pentru a verifica dacă inversează corect un șir de caractere.
     */
    @Test
    void testReverse() {
        assertEquals("cba", StringUtils.reverse("abc"), "Inversarea lui 'abc' trebuie să fie 'cba'");
    }

    /**
     * Testează metoda reverse() pentru a verifica dacă aruncă excepție atunci când input-ul este null.
     */
    @Test
    void testReverseNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StringUtils.reverse(null);
        });
        assertEquals("Input cannot be null", exception.getMessage());
    }
}
