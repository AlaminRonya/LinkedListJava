public class QueueClass {
    private int []queue;
    private int size;
    private int total;
    private int front;
    private int rear;
    public QueueClass(){
        size = 50;
        total = 0;
        front = 0;
        rear = 0;
        queue = new int[size];
    }
    public QueueClass(int size){
        this.size = size;
        total = 0;
        front = 0;
        rear = 0;
        queue = new int[this.size];
    }
    public boolean enqueue(int item){
        if (isFull()){
            return false;
        }else {
            total++;
            queue[rear] = item;
            rear = (rear+1)%size;
            return true;
        }

    }
    public int dequeue(){
        if (isEmpty()) {
            throw new RuntimeException("Is empty");
        }else {
            int item = queue[front];
            total--;
            front = (front + 1)%size;
            return item;
        }
    }

    private boolean isEmpty() {
        return total == 0;
    }

    private boolean isFull() {
        return (size == total);
    }
}
