package seminar3.tasks;

import java.util.ArrayList;
import java.util.List;

public class SunSystem {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Earth");
        planets.add("Venus");
        planets.add("Venus");
        planets.add("Mercury");
        planets.add("Venus");
        ArrayList<Integer> countPlanets = new ArrayList<>();
        ArrayList<String> resultList = new ArrayList<>();
        for (String planet : planets) {
            int position = resultList.indexOf(planet);
            if (position >= 0) {
                countPlanets.set(position, countPlanets.get(position)+1);
            } else {
                resultList.add(planet);
                countPlanets.add(1);
            }
        }
        printPlanetsCount(resultList, countPlanets);

    }

    private static void printPlanetsCount(List<String> planets, List<Integer> counts) {
        for (int i = 0; i < planets.size(); i++) {
            System.out.printf("%-10s : %3d%n", planets.get(i), counts.get(i));
        }
    }
}
