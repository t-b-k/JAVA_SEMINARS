package seminar4.tasks;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
public class ArrayToStackAndQueue {

    public static void arrayToStackAndQueue () {
        int[] wrkArray = {1,2,3,4,5,8,456,4,2,67};
        Stack<Integer> ourStack = new Stack<>();
        Queue<Integer> ourQueue = new LinkedList<>();

        for (int i = 0; i < wrkArray.length) {
            ourStack.push(wrkArray[i]);
            ourQueue.add(wrkArray[i]);
        }
        System.out.println(ourStack);
        System.out.println(ourQueue);
    }

}
