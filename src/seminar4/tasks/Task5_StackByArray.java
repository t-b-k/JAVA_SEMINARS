package seminar4.tasks;

// Реализовать стэк с помощью массива.
// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

public class Task5_StackByArray {

// Объявим массив, который будет использоваться для хранения наших данных
    private int[] array;
    private int capacity;
    private int top;

// конструктор класса, который будет использоваться для создание объектов этого класса по умолчанию.
// Конструктор показывает, из чего должен состоять экземпляр класса:  из чего он строится.
// Если такой конструктор по умолчанию не прописать, JAVA его создаст сама:
    public Task5_StackByArray(){
        int size = 3;
        array = new int[size];
        capacity = size;
        top = -1;
    }

// Напишем метод автоматического увеличения емкости стека.
// Он будет приватным, поскольку не предполагается, что кто-то извне будет им пользоваться.
// Это так называемый "подкапотный" метод.
    private void addCapacity() {
        int[] copy = new int[array.length + array.length/2]; // Увеличиваем capacity в полтора раза
        System.arraycopy(array, 0, copy, 0, array.length);
        array = copy;
        capacity = array.length;
    }
    public int getCapacity() {
        return capacity;
    }
// Все методы публичные, поскольку предполагается, что ими будут пользоваться из других проектов
// Это так называемый "контракт": какие возможности наш класс Task5_StackByArray будет предоставлять
// для работы со своими объектами
    public int size() {
        return top+1;
    }
    public boolean empty() {
        return top == -1;
    }

    // Объявляя типом метода наш класс, мы даем ему возможность возвращать в качестве
    // результата объект того же класса
    public Task5_StackByArray push (int value) { // Добавляет элемент в начало стека
        if (isFull()) {
            addCapacity();
        }
        array[++top] = value;
        return this;
    }
    public int peek() {
        if (!empty()) {
            return array[top];
        } else {
            throw new RuntimeException("Stack is empty!!!");
        }
    }
    public int pop () {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }
        peek();
        return array[top--];
    }

    private boolean isFull() {
        return size() == capacity;
    }
}

