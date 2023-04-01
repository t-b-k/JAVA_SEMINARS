package seminar3.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на экран.
public class sem3Task1 {

    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>();
        Random random = new Random();
        listOfNumbers.add(random.nextInt(11));
        listOfNumbers.add(random.nextInt(11));
        listOfNumbers.add(random.nextInt(11));
        listOfNumbers.add(random.nextInt(11));
        listOfNumbers.add(random.nextInt(11));
        listOfNumbers.add(random.nextInt(11));
        listOfNumbers.add(random.nextInt(11));
        listOfNumbers.add(random.nextInt(11));
        listOfNumbers.add(random.nextInt(11));
        listOfNumbers.add(random.nextInt(11));
        System.out.println(listOfNumbers);
        Collections.sort(listOfNumbers);
        System.out.println(listOfNumbers);
    }
}
