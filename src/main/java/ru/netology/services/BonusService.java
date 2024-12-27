package ru.netology.services;

public class BonusService {

    public int calculate(int income, int expenses) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        int threshold = 20_000; //порог денег для отдыха
        for (int month = 0; month < 12; month++) {
            if (money >= expenses) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
            } else {
                money = money + income;
            }
        }
        return count;
    }
}
