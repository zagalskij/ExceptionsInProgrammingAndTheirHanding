package ru.zagalskij.api.seminar1.Task0.Data;

import java.util.Arrays;
import java.util.Random;

public class MyArray {

    Random random = new Random();
    int arraySize = random.nextInt(10) + 1;
    private int[] array = new int[arraySize];
    public int[] generateRandomArray() {


        // Заполнение массива случайными данными
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(10); // Пример: генерация случайного числа от 0 до 99
        }

        return array;
    }
    public int findValueIndex(int[] array, int value, int minValue){
        if (array==null)
            return -3;
        if (array.length<minValue)
            return -1;
        int count = 0;
boolean allZeros = true;
        for (int itVar: array
        ) {
            if (itVar!=0)
                allZeros = false;
        }
        if (allZeros)
            return -4;
        for (int itVar: array
             ) {
            if (itVar==value)
                return count;
            else count++;
        }
        return -2;
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

}
