package org.example;

import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int calculateDaysBetweenDates(Date date1, Date date2) {
        return (int) ChronoUnit.DAYS.between(date1.toInstant(), date2.toInstant());
    }

    public String convertToUpperCase(String input) {
        return input.toUpperCase();
    }

    // crea una función para pasar una contraseña a base 64
    // escribe el javadoc
    /**
     * Converts a password to base 64.
     *
     * @param password the password to convert
     * @return the password in base 64
     */
    public String convertToBase64(String password) {
        return Base64.getEncoder().encodeToString(password.getBytes());

    }

    // crea una función para decodificar un base 64
    // escribe el javadoc
    /**
     * Decodes a base 64 password.
     *
     * @param base64 the base 64 password to decode
     * @return the decoded password
     */
    public String decodeBase64(String base64) {
        return new String(Base64.getDecoder().decode(base64));
    }
}

