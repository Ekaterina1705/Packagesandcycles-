package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrtServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    public void testSqrt(int min, int max, int expected) {
        SqrtService service = new SqrtService();
        int actual = service.calcSqrt(min, max);

        Assertions.assertEquals(expected, actual);
    }
}



