package seminar3.tasks;

import java.util.ArrayList;
import java.util.List;

//Каталог товаров книжного магазина сохранен в виде двумерного списка
// List<ArrayList<String>> так, что на 0-й позиции каждого внутреннего
// списка содержится название жанра, а на остальных позициях - названия книг.
// Напишите метод для заполнения данной структуры.
public class Sem3Task2 {
    public static List<ArrayList<String>> library = new ArrayList<>();
    public static void fillLibrary (ArrayList<String> books) {
        library.add(books);
        System.out.println(library);
    }
}
