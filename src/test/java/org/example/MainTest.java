package org.example;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MainTest {
    @Test
    public void calculateDaysBetweenDates_ShouldReturnCorrectDays_WhenDatesAreInSameMonth() {
        Main main = new Main();
        Date date1 = new Date(2022, 1, 1);
        Date date2 = new Date(2022, 1, 31);

        int result = main.calculateDaysBetweenDates(date1, date2);

        assertEquals(30, result);
    }

    @Test
    public void calculateDaysBetweenDates_ShouldReturnCorrectDays_WhenDatesAreInDifferentMonths() {
        Main main = new Main();
        Date date1 = new Date(2022, 1, 1);
        Date date2 = new Date(2022, 2, 1);

        int result = main.calculateDaysBetweenDates(date1, date2);

        assertEquals(28, result);
    }

    @Test
    public void calculateDaysBetweenDates_ShouldReturnZero_WhenDatesAreSame() {
        Main main = new Main();
        Date date1 = new Date(2022, 1, 1);
        Date date2 = new Date(2022, 1, 1);

        int result = main.calculateDaysBetweenDates(date1, date2);

        assertEquals(0, result);
    }

    @Test
    public void calculateDaysBetweenDates_ShouldReturnNegative_WhenEndDateIsBeforeStartDate() {
        Main main = new Main();
        Date date1 = new Date(2022, 1, 31);
        Date date2 = new Date(2022, 1, 1);

        int result = main.calculateDaysBetweenDates(date1, date2);

        assertEquals(-30, result);
    }

    // crear test para convertToUpperCase
    @Test
    public void convertToUpperCase_ShouldReturnUpperCase_WhenInputIsLowerCase() {
        Main main = new Main();
        String input = "hello";

        String result = main.convertToUpperCase(input);

        assertEquals("HELLO", result);
    }
    @Test
    public void convertToBase64_ShouldReturnBase64_WhenInputIsNormalString() {
        Main main = new Main();
        String result = main.convertToBase64("password");
        assertEquals("cGFzc3dvcmQ=", result);
    }

    @Test
    public void convertToBase64_ShouldReturnBase64_WhenInputIsEmptyString() {
        Main main = new Main();
        String result = main.convertToBase64("");
        assertEquals("", result);
    }

    @Test
    public void decodeBase64_ShouldReturnOriginalString_WhenInputIsBase64Encoded() {
        Main main = new Main();
        String result = main.decodeBase64("cGFzc3dvcmQ=");
        assertEquals("password", result);
    }

    @Test
    public void decodeBase64_ShouldReturnEmptyString_WhenInputIsEmpty() {
        Main main = new Main();
        String result = main.decodeBase64("");
        assertEquals("", result);
    }

    @Test
    public void findParentOfThirdPersonWhoseNameStartsWithI_ShouldReturnParent_WhenThirdPersonNameStartsWithI() {
        Main main = new Main();
        Person person1 = new Person("Ian", "John");
        Person person2 = new Person("Isaac", "David");
        Person person3 = new Person("Igor", "Michael");
        Object[] people = {person1, person2, person3};

        String result = main.findParentOfThirdPersonWhoseNameStartsWithI(people);

        assertEquals("Michael", result);
    }

    @Test
    public void findParentOfThirdPersonWhoseNameStartsWithI_ShouldReturnNull_WhenLessThanThreePeopleNameStartsWithI() {
        Main main = new Main();
        Person person1 = new Person("Ian", "John");
        Person person2 = new Person("Isaac", "David");
        Object[] people = {person1, person2};

        String result = main.findParentOfThirdPersonWhoseNameStartsWithI(people);

        assertNull(result);
    }

    @Test
    public void findParentOfThirdPersonWhoseNameStartsWithI_ShouldReturnNull_WhenNoPersonNameStartsWithI() {
        Main main = new Main();
        Person person1 = new Person("John", "David");
        Person person2 = new Person("David", "Michael");
        Object[] people = {person1, person2};

        String result = main.findParentOfThirdPersonWhoseNameStartsWithI(people);

        assertNull(result);
    }

    @Test
    public void findParentOfThirdPersonWhoseNameStartsWithI_ShouldIgnoreNonPersonObjects() {
        Main main = new Main();
        Person person1 = new Person("Ian", "John");
        Person person2 = new Person("Isaac", "David");
        Person person3 = new Person("Igor", "Michael");
        Object[] people = {person1, "Not a person", person2, person3};

        String result = main.findParentOfThirdPersonWhoseNameStartsWithI(people);

        assertEquals("Michael", result);
    }
}
