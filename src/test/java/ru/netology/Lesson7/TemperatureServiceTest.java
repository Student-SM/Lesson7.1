package ru.netology.Lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureServiceTest {

    @Test

    public void dayMinTemperature() { // день с минимальной температурой
        TemperatureService service = new TemperatureService();

        int[] temp = {18, 20, 22, 1, 5}; //завели массив температур

        int expected = 3;  // ожидаемый - это день с температурой 1 градус,он у нас в ячейке №3 (нумерация с нуля)
        int actual = service.getMinDay(temp);

        Assertions.assertEquals(expected, actual);

    }
}
