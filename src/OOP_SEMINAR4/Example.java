package OOP_SEMINAR4;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(1);
        list.add(true);
        list.add("dslkfjweof");

        printList(list);
        printListNumbers(list);

//        for (Object o: list) {
//            System.out.println(((String) o).length());
        // ЗДЕСЬ БУДЕТ CLASS CAST EXCEPTION
    }
        public static void printList (List<?> list) {
            for (Object elem : list)
                System.out.println(elem + "");
            System.out.println();
        }
        public static void printListNumbers (List<? extends Number> list) {
        for (Object elem : list)
            System.out.println(elem);
        System.out.println();
        }
}

