package stacks;

import stacks.Node;

public class Stack{
    private Node last;
    private int size;

    public Stack(){
        size = 0;
        last = null;
    }

    public void push(Node node){
        if(size == 0){
            last = node;
            node.prev = null;
        } else {
            node.prev = last;
            last = node;
        }
        size += 1;
    }

    public Node pop(){
        if(size == 0) {
            return null;
        }
        Node node = last;
        last = node.prev;
        size -= 1;
        return node;
    }

    public int getSize(){
        return size;
    }

    public void display(){
        if(last != null){
            Node n = last;
            while(true){
                System.out.print(n.item.toString());
                if(n.prev == null){
                    break;
                } else {
                    n = n.prev;
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        Stack s = new Stack();
        s.push(new Node('{'));
        s.push(new Node('('));
        s.push(new Node('['));
        s.push(new Node(']'));
        s.push(new Node(')'));
        s.push(new Node('}'));
        s.display();
        s.pop();
        s.display();
    }
}
