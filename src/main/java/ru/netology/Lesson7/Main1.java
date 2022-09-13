package ru.netology.Lesson7;


import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        String[] arr = new String[5]; //массив Стрингового типа с пятью ячейками

        System.out.println(arr[3]); // в третьей ячейке лежит null
        System.out.println(Arrays.toString(arr)); // все ячейк заполнены [null, null, null, null, null]
    }
}
