package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test

    public void calcTestWithFewMatches() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresMinimumLimit() {
        SQRService service = new SQRService();

        int expected = 1;
        int min = 100;
        int max = 100;

        int actual = service.calc(min, max);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresMaximumLimit() {
        SQRService service = new SQRService();

        int expected = 90;
        int min = 100;
        int max = 9801;

        int actual = service.calc(min, max);

        Assertions.assertEquals(expected, actual);
    }
}
