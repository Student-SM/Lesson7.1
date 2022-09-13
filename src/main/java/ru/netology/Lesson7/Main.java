package ru.netology.Lesson7;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5]; // создаем массив int в котором будет 5 ячеек

        arr[3] = 11; //присваеваем ячейке номер 3 значение 11.

        System.out.println(arr[3]); //выводим третью ячейку,и видим что там 11

        System.out.println(Arrays.toString(arr)); //глобальная команда вывода массива
    }
}
