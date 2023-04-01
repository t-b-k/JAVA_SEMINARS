package seminar2.Tasks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Напишите метод, который вернет содержимое текущей папки в виде массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим методом, в файл.
// Обработайте ошибки с помощью конструкции try-catch.
// В случае возникновения исключения оно должно записаться в log-файл
public class FilesLogAndExceptions {
    private static final Logger LOG = Log.log(FilesLogAndExceptions.class.getName());
// Комбинация FilesLogAndExceptions
    public static void write (String path) {
        try (FileWriter in = new FileWriter("test.txt")) {
            String[] data =  getFilesInFolder(path);
// FileWriter устроен так, что если файла нет, он его создаст, а если есть - воспользуется существующим
// in - это так называемый "поток ввода", куда мы будем передавать информаию для дальнейшей записи в файл
            for (String datum : data) {
                in.append(datum);
            }
            LOG.log(Level.INFO, "RECORDED!");
            throw new IOException("Ошибка!");
        } catch (IOException e) {
            LOG.log(Level.INFO, e.getMessage());
        }
    }

    // Создадим в пакете tasks отдельный класс, который будет отвечать за логирование: Log
    public static String[] getFilesInFolder (String path){
        File dir = new File (path);
        String[] result;
        result = null;
        File[] files;
        if (dir.isDirectory()) {
            files = dir.listFiles();
            if (files != null) {
                result = new String[files.length];
                for (int i = 0; i < result.length; i++) {
                    String name = files[i].getName();
                    if (files[i].isFile()) {
                        System.out.println("\tFile - " + name);
                    }
                    else {
                        System.out.println("\tDirectory - " + name);
                    }
                    result[i] = name;
                }
            }
        } else {
            System.out.println(dir.getName() + "Не является папкой");
        }
        return result;
    }

}
