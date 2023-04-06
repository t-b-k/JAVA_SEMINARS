package seminar4.tasks;

// Замерьте время, за которое в ArrayList добавятся 10000 элементов
// Замерьте время, за которое в LinkedList добавятся 10000 элементов
// Сравните

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1AddTimeCalculator {
    private static int LENGTH = 1000000;

    public static void getTime () {

        List<Integer> intArrayList = new ArrayList<>();
        List<Integer> intLinkedList = new LinkedList<>();

        // Удивительно, но ArrayList на добавление элементов сраборал быстнее в 4 раза )))

        // Засекаем время
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < LENGTH; i++) {
            intArrayList.add(i);
        }

        long endTime = System.currentTimeMillis();

        double result = (endTime - startTime);

        System.out.printf("Run time for ArrayList: %s %s %n", result, "ms");

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < LENGTH; i++) {
            intLinkedList.add(i);
        }
        long endTime2 = System.currentTimeMillis();

        result = (endTime2 - startTime2);
        System.out.printf("Run time for LinkedList: %s %s %n", result, "ms");
    }
}