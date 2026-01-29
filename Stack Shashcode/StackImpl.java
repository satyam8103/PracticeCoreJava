import java.util.Scanner;
import java.util.Stack;

public class StackImpl {

    int stack[];
    int top ;
    int size;

    public StackImpl(int stackSize){  //passing value input from user
        stack = new int[stackSize];
        size = stackSize;
        top =-1;
    }

    public void push(int element){
        if(top>= size-1){
            System.out.println("stack is full");
            return;
        }
        top++;
        stack[top] = element;
    }

    public boolean isEmpty(){
        return top <=-1;
    }
    public int size(){
        return top +1;  // if index is 0,1,2, so top is 2 after top+1 =3;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }
    public int pop(){
        int val =peek();
        if(val!= Integer.MIN_VALUE){
            top--;
        }
        return val;
    }

    public void printStack(){
        System.out.println("printing stack ");
        for (int i =0;i<=top;i++){
            System.out.print(stack[i]);
            if (i!=top){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("enter the size of stack");
        Scanner sc= new Scanner(System.in);
        int stack = sc.nextInt();
        StackImpl stack1 = new StackImpl(stack);
        System.out.println("isEmpty: "+  stack1.isEmpty());
        stack1.push(8);
        stack1.printStack();
        stack1.push(1);
        stack1.printStack();
        stack1.push(8);
        stack1.printStack();
        stack1.pop();
        stack1.push(2);
        stack1.push(8);
        stack1.printStack();
        stack1.push(2);
        stack1.pop();
        stack1.printStack();
        System.out.println("size: " +stack1.size());
        System.out.println("isEmpty:"+stack1.isEmpty());
        stack1.pop();
        stack1.printStack();
        stack1.pop();
        stack1.pop();
//        stack1.pop();
        stack1.printStack();
        System.out.println("peek:"+ stack1.peek());

        //jc stack
        Stack <Integer> myStack = new Stack<>();
        myStack.peek();
        myStack.push(2);
        myStack.push(2);
        myStack.push(6);
        myStack.pop();
        myStack.size();
        myStack.isEmpty();
        System.out.println(myStack);
    }
}
