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


    // crea una función que recorra un array de objetos que continene un objeto de personas. Debe encontrar el tercer objeto cullo nombre empiece por la letra "I", de el extrae el nombre de su perror y lo devuelves
    // escribe el javadoc
    /**
     * Finds the third person whose name starts with the letter "I" in an array of objects containing a person object. Extracts the name of their parent and returns it.
     *
     * @param people the array of objects containing a person object
     * @return the name of the parent of the third person whose name starts with the letter "I"
     */
    // Cálculo de la complejidad ciclomática: 4
    public String findParentOfThirdPersonWhoseNameStartsWithI(Object[] people) {
        int count = 0;
        for (Object person : people) {
            try {
                Person p = (Person) person;
                if (p.getName().startsWith("I")) {
                    count++;
                    if (count == 3) {
                        return p.getParent();
                    }
                }
            } catch (ClassCastException e) {
                System.out.println("El objeto no es una persona.");
            }
        }
        return null;
    }
}

