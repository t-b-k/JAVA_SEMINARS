package seminar4.tasks;

//         1:27:59 в записи чата
//         Реализовать консольное приложение, которое:
//         Принимает от пользователя и “запоминает” строки.
//         Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//         Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task3_OperationsWithStrings {

    public static void operateWithStrings () {
        Scanner scanner = new Scanner (System.in);
        Deque<String> texts = new ArrayDeque<>();

        while (true) {
            System.out.print("\nВведите\n [text] для добавления текста в список, " +
                    "\n print \t- для выведения в консоль записей в обратном порядке, " +
                    "\n revert\t- для удаления последней введенной записи." +
                    "\n exit  \t- для выходы из программы ===> ");
            String stg = scanner.nextLine();

            if (stg.equalsIgnoreCase("print")) {
                System.out.println(texts);
            } else if (stg.equalsIgnoreCase("revert")) {
                System.out.println("Удалили строку \"" + texts.pop() + "\"");
            } else if (stg.equalsIgnoreCase("exit")) {
                System.out.println("EXIT\n");
                break;
            } else {
                texts.push(stg);
            }
        }
    }
}
