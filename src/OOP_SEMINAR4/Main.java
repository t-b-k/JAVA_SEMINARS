package OOP_SEMINAR4;

import seminar7.BottleOfWater;

public class Main {
    public static void main(String[] args) {

        Something<seminar7.BottleOfWater> something = new Something<>();
        System.out.println(something.get(new BottleOfWater("Кола", 89.90, 1)));
    }
}
