package stacks;

class Node{
    Object item;
    Node prev;

    public Node(){
        item = null;
        prev = null;
    }

    public Node(Object obj){
        item = obj;
        prev = null;
    }
}
