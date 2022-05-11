package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void testByExample() {
        SQRService service = new SQRService();

        int actual = service.calculationOfSquaresOfNumbersInTheRange(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFullRange() {
        SQRService service = new SQRService();

        int actual = service.calculationOfSquaresOfNumbersInTheRange(100, 9801);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOutRange() {
        SQRService service = new SQRService();

        int actual = service.calculationOfSquaresOfNumbersInTheRange(0, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

}






