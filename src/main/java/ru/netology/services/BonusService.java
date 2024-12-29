package ru.netology.services;

public class BonusService {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        // Начальное состояние: нет денег
        int balance = 0;
        int vacationMonths = 0;

        for (int month = 1; month <= 12; month++) {
            if (balance >= threshold) {
                // Отдыхаем, уменьшаем баланс на расходы и и остаток делим на 3
                balance = balance - expenses;
                balance = balance / 3;
                vacationMonths++;
            } else {
                // Работаем, добавляем доход и вычитаем расходы
                balance = balance + income;
                balance = balance - expenses;
            }
        }

        return vacationMonths;
    }
}
