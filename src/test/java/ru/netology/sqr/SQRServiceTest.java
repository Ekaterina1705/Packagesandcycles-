package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {

@Test

    public void calcTestWithFewMatches() {
    SQRService service = new SQRService();

    int actual = SQRService.calculateSQR(200, 300);
    int expected = 3;

    Assertions.assertEquals(expected, actual);
}

    @Test
    void shouldCalculateNumberOfSquaresMinimumLimit() {
        SQRService service = new SQRService();

        int expected = 1;
        int minNumber = 100;
        int maxNumber = 100;

        int actual = SQRService.calculateSQR(minNumber, maxNumber);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateNumberOfSquaresMaximumLimit() {
        SQRService service = new SQRService();

        int expected = 90;
        int minNumber = 100;
        int maxNumber = 9801;

        int actual = SQRService.calculateSQR(minNumber, maxNumber);

        Assertions.assertEquals(expected, actual);
    }
}
