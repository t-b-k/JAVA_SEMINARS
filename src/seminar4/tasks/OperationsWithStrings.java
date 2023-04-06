package seminar4.tasks;

// Реализовать консольное приложение, которое:
//         Принимает от пользователя и “запоминает” строки.
//         Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//         Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class OperationsWithStrings {

    public static void operateWithStrings (String[] args) {
        Scanner scanner = new Scanner (System.in);
        Deque<String> texts = new ArrayDeque();

        while (true) {
            System.out.print("\nВведите\n [text] для добавления текста в список, " +
                    "\n print for reverse print....");
            String stg = scanner.nextLine();

            if (stg.equalsIgnoreCase("print") ) {
                System.out.println(texts);
//            } else if () {
            }
        }
    }
}
