package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class BonusServiceTest {

    @ParameterizedTest
   // @CsvSource({
            //Месяц 1. Денег 0. Придётся работать. Заработал +10000, потратил -3000
      //      "10_000,3_000"
    //})
    @CsvFileSource(files="src/test/resources/bonus.csv" )
    public void testNumberOfMonthsOfRest(int income, int expenses) {
        BonusService service = new BonusService();

        Assertions.assertEquals(income, expenses);
    }

}
