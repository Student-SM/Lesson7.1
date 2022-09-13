package ru.netology.Lesson7;

public class TemperatureService {

    public int getMinDay(int[] temps) {   //создаем функцию,которая ищет день с минимальной температурой

        int minDay = 0;   //заводим день и присваеваем ему день номер нуль (0).
        for (int i = 0; i < temps.length; i++) {  //цикл,перебираем температуры
            if (temps[i] < temps[minDay]) {  //если температура в день i меньше ,чем в тот день который мы запомнили,то
                minDay = i; // то, этот день i
            }
        }
        return minDay;
    }

    public  int getMinTemp(int[] temp) {  //создаем функцию,которая ищет минимальную температуру

        int minTemp = temp[0];//заводим день с мин.температурой и это будет температура из ячейки нуль(первая из массива)
        for (int t : temp) { //цикл,заводим переменную и пробегаемся по массиву temp
            if (t < minTemp) { //
                minTemp = t;
            }
        }
        return minTemp;
    }
}
//   public  int getMinTemp(int[] temp) {  //или можно так сделать
//     int minDay = getMinDay(temps);     //или можно так сделать
//       return temps[minDay];           //или можно так сделать

