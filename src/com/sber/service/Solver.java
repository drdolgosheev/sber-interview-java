package com.sber.service;

/**
 * Class that implements the required task
 * @author Dmitriy Dolgosheev
 * @version 1.0
 **/
public class Solver {

    /**
     * Solve the following task
     *
     * @param a number of days on Vasya's card
     * @param b number of of days on Petya's card
     * @param k division number
     **/
    public static int solve(int a, int b, int k) {
        // Счетчик дней
        int dayCounter = 0;
        // Ищем максимум для определения числа итераций
        int max = Math.max(a, b);

        for (int i = 0; i < max; i++) {
            // Т.к. на табло числа < 100 то создаем копию элементов
            int temp_a, temp_b;

            // На случай ошибки во входном файле
            if (k <= 0) {
                System.out.println("Некорректный ввод");
                return -1;
            }

            // Если больше 100 то запоминаем 99 иначе сохраняем занчение a
            if (a >= 100)
                temp_a = 99;
            else
                temp_a = a;

            // Если больше 100 то запоминаем 99 иначе сохраняем занчение b
            if (b >= 100)
                temp_b = 99;
            else
                temp_b = b;

            // Если одни число стало меньше нуля, значит решений нет, возвращаем -1
            if (temp_a <= 0 || temp_b <= 0)
                return -1;

            // Если делится нацело, то возварщаем счетчик дня
            if (temp_a / temp_b == k)
                return dayCounter;

            // Добавляем день
            dayCounter++;
            // Уменьшаем кол-во доступных поездок
            a--;
            b--;
        }

        return -1;
    }
}
