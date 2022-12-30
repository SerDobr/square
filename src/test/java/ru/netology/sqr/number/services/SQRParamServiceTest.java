package ru.netology.sqr.number.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRParamServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/border.csv")
    public void numericalBoundaries(int min, int max, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculateSQR(min, max);
        Assertions.assertEquals(expected, actual);
    }
}
