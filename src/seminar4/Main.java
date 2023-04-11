package seminar4;

//import static seminar4.tasks.ArrayToStackAndQueue.arrayToStackAndQueue;
import seminar4.tasks.Task2_LinkedListExample;
import seminar4.tasks.Task5_StackByArray;

import static seminar4.tasks.Task1AddTimeCalculator.getTime;
import static seminar4.tasks.Task3_OperationsWithStrings.operateWithStrings;
import static seminar4.tasks.Task4_ArrayToStackAndQueue.putArrayToStackAndQueue;

public class Main {
    public static void main(String[] args) {
//        addTimeCalculator();
        System.out.print("\033[H\033[J");
//        getTime();
//        Task2_LinkedListExample.run();
//        operateWithStrings();
//        putArrayToStackAndQueue ();
        Task5_StackByArray ourNewStack = new Task5_StackByArray();
        ourNewStack.push(123);
        ourNewStack.push(90);
        ourNewStack.push(-24);
        ourNewStack.push(0);
        ourNewStack.push(-119);

        for (int i = 0; i < ourNewStack.getCapacity()-1; i++) {
            System.out.print(ourNewStack.pop() + " ");
        }
    }
}
