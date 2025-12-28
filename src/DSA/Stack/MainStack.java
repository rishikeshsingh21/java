package DSA.Stack;

class Stack{
    int[] stack = new int[5];
    int top = 0;

    public boolean isEmpty(){
        return top != stack.length;
    }

    public void push(int data){
        if(!isEmpty()){
            System.out.println("Stack is full");
            return;
        }
        stack[top] = data;
        top++;
    }

    public void pop(){
        if(top == 0){
            System.out.println("stack is empty");
            return;
        }
        stack[top] = 0;

        System.out.println("Poped: ");
    }
    public void show(){
        for(int n : stack){
            System.out.print(n+" ");
        }
    }
}
public class MainStack {
    public static void main(String[] args) {
        Stack obj = new Stack();

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(60);
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();

        obj.show();
    }
}
