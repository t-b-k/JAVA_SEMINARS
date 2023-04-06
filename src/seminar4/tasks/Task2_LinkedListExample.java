package seminar4.tasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Реализовать консольное приложение, которое:
 * Принимает от пользователя строку вида
 * text:num
 * Нужно сделать “сплит” строки по ":", сохранить text в связный список на позицию num.
 * Если введено print:num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */
public class Task2_LinkedListExample {
    private static final List<String> strings = new LinkedList<>();

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> texts= new LinkedList<>();

        while (true) {
            System.out.println("Введите: \n\t<text>:<number> - чтобы добавить text в список на позицию number" +
                    "\n\tprint:<number> - чтобы вывести в консоль текст, хранящийся на позиции <number>" +
                    "\n\texit - для завершения работы приложения ==> ");
            String inputString = scanner.nextLine();
            String[] partsOfInput = inputString.split(":");

            if (partsOfInput.length > 1 && isNumeric(partsOfInput[1])) {
                int position = Integer.parseInt(partsOfInput[1]);
                if (position >= 0) {
                    if (partsOfInput[0].toLowerCase().equals("print") && position < texts.size()) {
                        if (position < texts.size()) {
                            System.out.println("На позиции " + position + " находится текст: " + "\'" +
                                    texts.get(position) + "\'\n");
                            texts.remove(position);
                        } else {
                            System.out.println("На данную позицию в списке еще ничего не записано. \n");
                        }
                    } else {
                        for (int i = texts.size(); i < position; i++) {
                            texts.add(i, "");
                        }
                        texts.add(position, partsOfInput[0]);
                    }
                }
            }
            if (Objects.equals(partsOfInput[0].toLowerCase(), "exit")) {
                System.out.println("EXIT!!!");
                break;
            }
        }
    }

    public static boolean isNumeric (String strNum){
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}