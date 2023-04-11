package seminar6;

import seminar6.tasks.Cat;
import seminar6.tasks.Owner;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Petrov Vasily", "003");
        Cat cat = new Cat("Simba", 13, true, "Linyaet", owner);
        Cat cat2 = new Cat ("Simba", 13, true, "Linyaet", owner);
        Cat cat3 = new Cat ("Simba", 13, true, "Linyaet", owner);
        Cat cat4 = new Cat ("Pumba", 13, true, "Linyaet", owner);
        System.out.println(cat);
        Set<Cat> cats = new HashSet<>();
        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        System.out.println(cats);
    }
}
