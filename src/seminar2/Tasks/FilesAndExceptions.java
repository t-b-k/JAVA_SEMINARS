package seminar2.Tasks;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

// Напишите метод, который составит строку, состоящую из 100 слов TEST, и метод,
// который запишет эту строку в текстовый файл. Обработайте исключения.
// Старый метод обработки исключений
public class FilesAndExceptions {
    public static void writeToFile (String str) {
        FileWriter in = null;
        try {
            in = new FileWriter("test.txt");
// FileWriter устроен так, что если файла нет, он его создаст, а если есть - воспользуется существующим
// in - это так называемый "поток ввода", куда мы будем передавать информаию для дальнейшей записи в файл
            in.append(buildStringOfHundredESTs());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // Новый метод обработки исключений: try with resources
    public static void writeToFile1 () {
        // try with resources: объявленный таким образом try закроется сам.
        // (Мы переносим открытие потока вывода внутрь оператора try
        // В try with resources можно вставлять любой объект, имплементирующий интерфейс closable
        try (FileWriter in = new FileWriter("test.txt")) {

// FileWriter устроен так, что если файла нет, он его создаст, а если есть - воспользуется существующим
// in - это так называемый "поток ввода", куда мы будем передавать информаию для дальнейшей записи в файл
            in.append(buildStringOfHundredESTs());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String buildStringOfHundredESTs () {
        StringBuilder stringOfHundredTests = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringOfHundredTests.append("TEST");
        }
        return stringOfHundredTests.toString();
   //     return "TEST".repeat(100); - короткая запись!
    }
}
