package com.sber;

import com.sber.dto.TestDataDto;
import com.sber.service.Solver;
import com.sber.service.TestReader;

public class Main {
    public static void main(String[] args) {
        int a, b, k, result, numberOfTests;

        // Указывем путь до .txt файла с тестовыми данными
        String filepath = "src/com/sber/input/input.txt";

        // Читаем входные данные
        TestDataDto testDataDto = TestReader.readData(filepath);

        numberOfTests = testDataDto.getNumOfTests();

        // Если входный файл некорректный
        if (numberOfTests <= 0){
            System.out.println("Неккоректные входные данные");
        }

        // Прогоняем для каждого набора тестовых данных
        for (int i = 0; i < numberOfTests; i++) {
            a = testDataDto.getListOfA().get(i);
            b = testDataDto.getListOfB().get(i);
            k = testDataDto.getListOfK().get(i);

            result = Solver.solve(a, b, k);
            System.out.println(result);
        }
    }
}
