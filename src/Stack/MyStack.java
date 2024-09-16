package Stack;

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

}
