package seminar3.tasks;

import java.util.ArrayList;

public class IntegersDeleter {
    public static void delIntFromList() {
        ArrayList ourArray = new ArrayList<String>();
        ourArray.add("ура!");
        ourArray.add(1);
        ourArray.add(713);
        ourArray.add(158);
        System.out.println(ourArray);
        for (int i = 0; i < ourArray.size(); i++) {
            if (ourArray.get(i) instanceof Integer) {
                ourArray.remove(i);
                i--;
            }
        }
        System.out.println(ourArray);
    }
}
