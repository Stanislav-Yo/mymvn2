package ru.netology.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FreelancerServiceTest {

    @Test
    public void shouldCalculateThreeVacationMonths() {
        BonusService service = new BonusService();
        int expected = 3;
        int result = service.calculateVacationMonths(10000, 3000, 20000);

        assertEquals(expected, result);
    }

    @Test
    public void shouldCalculateTwoVacationMonths() {
        BonusService service = new BonusService();
        int expected = 2;
        int result = service.calculateVacationMonths(100000, 60000, 150000);

        assertEquals(expected, result);
    }
}
