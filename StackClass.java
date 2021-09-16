import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StackClass {

    private int [] stack;
    private int size;
    private int top;

    public StackClass() {
        top = -1;
        size = 50;
        stack = new int [size];
    }
    public StackClass(int size){
        top = -1;
        this.size = size;
        stack = new int[this.size];
    }

    private final Supplier<Boolean> isFull = ()-> this.top == stack.length-1;
    private final Supplier<Boolean> isEmpty = ()-> this.top == -1;

    public Predicate<Integer> pushItem = item -> {
        if (!isFull.get()){
            this.top++;
            stack[this.top] = item;
            return true;
        }
        return false;
    };
    public Supplier<Integer> pop = ()->{
        if (!isEmpty.get()){
            return stack[this.top--];
        }
        return  Integer.MIN_VALUE;
    };


    /* public boolean push(int item){
        if (!isFull()){
            this.top++;
            stack[this.top] = item;
            return true;
        }
        return false;
    }
    private boolean isFull(){
        return this.top == stack.length-1;
    }
    public int pop(){
        if (!isEmpty()){
            //int item = stack[this.top];
            return stack[this.top--];
        }
        return  Integer.MIN_VALUE;
    }
    private boolean isEmpty(){
        return this.top == -1;
    }*/




}
