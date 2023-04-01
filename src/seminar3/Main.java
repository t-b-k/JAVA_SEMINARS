package seminar3;

import seminar3.tasks.IntegersDeleter;
import seminar3.tasks.Sem3Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> poetry = new ArrayList<>();
        poetry.add("Поэзия");
        poetry.add("Евгений Онегин");
        poetry.add("Облако в штанах");
        ArrayList<String> prose = new ArrayList<>();
        prose.add("Проза");
        prose.add("Накануне");
        prose.add("Преступление и наказание");

        Sem3Task2.fillLibrary(poetry);
        Sem3Task2.fillLibrary(prose);
        IntegersDeleter.delIntFromList();
    }
}
