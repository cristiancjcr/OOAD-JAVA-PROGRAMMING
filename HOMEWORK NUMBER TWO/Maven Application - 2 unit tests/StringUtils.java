package com.example;

/**
 * Clasa StringUtils oferă metode pentru manipularea textului.
 */
public class StringUtils {

    /**
     * Inversează un șir de caractere.
     * @param input Șirul de caractere care trebuie inversat
     * @return Șirul inversat
     * @throws IllegalArgumentException dacă input-ul este null
     */
    public static String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return new StringBuilder(input).reverse().toString();
    }
}
