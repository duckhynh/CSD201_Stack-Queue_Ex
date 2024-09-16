package Stack;

import java.util.Stack;

public class MyStack {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node top;
    private int length;

    public MyStack(){
        top = null;
        length = 0;
    }
    public int getLength(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        length++;
    }
    public Object pop() {
        if(isEmpty()) return null;
        int res = top.data;
        top = top.next;
        length--;
        System.out.println("Removed element: " + res);
     return res;
    }
    public static void main(String[] args) {
        MyStack stack = new MyStack();  
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        System.out.println("pop: " + stack.pop());
        stack.pop();  
    }
    
}
