package com.sber.service;
import com.sber.dto.TestDataDto;

import java.io.*;

/**
 * Class to read test data
 * @author Dmitriy Dolgosheev
 * @version 1.0
 **/
public class TestReader {

    /**
     * Read test data
     *
     * @param filepath path to test data file
     **/
    public static TestDataDto readData(String filepath) {
        TestDataDto testDataDto = new TestDataDto();

        try {
            // Кол-во тестов
            int testNum;
            // Далее считываем даные из файла
            File file = new File(filepath);

            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            // Из первой строки берем кол-во тестов
            testNum = Integer.parseInt(reader.readLine());

            testDataDto.setNumOfTests(testNum);

            for (int i = 0; i < testNum; i++) {
                int temp_a, temp_b, temp_k;

                // Считываем строку
                String line = reader.readLine();

                // Делим по пробелу
                String[] temp = line.split(" ");

                // Сохранияем текущие значение
                temp_a = Integer.parseInt(temp[0]);
                temp_b = Integer.parseInt(temp[1]);
                temp_k = Integer.parseInt(temp[2]);

                // Добавляем в наш объект
                testDataDto.addToListOfA(temp_a);
                testDataDto.addToListOfB(temp_b);
                testDataDto.addToListOfK(temp_k);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return testDataDto;
    }
}
