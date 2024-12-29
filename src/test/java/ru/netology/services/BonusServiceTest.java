package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FreelancerServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Bonus.csv")
    public void shouldCalculateThreeVacationMonths(int expected, int income, int expenses, int threshold) {
        BonusService service = new BonusService();
        //int expected = 3;
        int result = service.calculateVacationMonths(income, expenses, threshold);

        assertEquals(expected, result);
    }
}

