package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "from 200 to 300, 200, 300, 3",
                    "from 100 to 9801, 100, 9801, 90",
                    "from 101 to 9800, 101, 9800, 88"
            }, delimiter=',')
    void shouldCountSqr(String testName, int minBorder, int maxBorder, int expected) {
        SQRService service = new SQRService();

        int actual = service.sqrCount(minBorder, maxBorder);

        assertEquals(expected, actual);
    }
}