package seminar4;

//import static seminar4.tasks.ArrayToStackAndQueue.arrayToStackAndQueue;
import seminar4.tasks.Task2_LinkedListExample;

import static seminar4.tasks.Task1AddTimeCalculator.getTime;

public class Main {
    public static void main(String[] args) {
//        addTimeCalculator();
        System.out.print("\033[H\033[J");
        getTime();
        Task2_LinkedListExample.run();
//        arrayToStackAndQueue();
    }
}
