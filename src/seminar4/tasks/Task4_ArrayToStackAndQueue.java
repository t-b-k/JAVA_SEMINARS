package seminar4.tasks;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
public class Task4_ArrayToStackAndQueue {

    public static void putArrayToStackAndQueue () {
        int[] wrkArray = {1,2,3,4,5,8,456,4,2,67,-13};

        System.out.println(Arrays.toString(wrkArray));
        Stack<Integer> ourStack = new Stack<>();
        Queue<Integer> ourQueue = new LinkedList<>();

        for (int i = 0; i < wrkArray.length; i++) {
            ourStack.push(wrkArray[i]);
            ourQueue.add(wrkArray[i]);
        }
        System.out.println(ourStack);
        System.out.println(ourQueue);

        for (int i = 0; i < wrkArray.length; i++) {
            System.out.print(ourStack.pop()+" ");
        }
        System.out.println("\n");
        for (int i = 0; i < wrkArray.length; i++) {
            System.out.print(ourQueue.poll() + " ");
        }
        System.out.println("\n");
    }
}


