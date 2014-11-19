package tree;

import slist.SList;

class Node{
    Object item;
    Node parent;
    Node child;
    SList<Node> sibling;

    public Node(Object item){
        this.item = item;
    }
    public void addSibling(Node n){
        if(sibling == null){
            sibling = new SList<Node>();
        }
        sibling.append(n);
    }
    public Node addChild(Object item){
        Node n = new Node(item);
        n.parent = this;
        if(child == null){
            child = n;
        } else {
            child.addSibling(n);
        }
        return n;
    }
    public void display(){
        System.out.print(item.toString() + " ");
    }
    public void preorder(){
        display();
        if (child != null)
            child.preorder();
        if (sibling != null){
            for(Object n: sibling.getItems()){
                ((Node)n).preorder();
            }
        }
    }
    public void postorder(){
        if (child != null)
            child.postorder();
        display();
        if (sibling != null){
            for(Object n: sibling.getItems()){
                ((Node)n).postorder();
            }
        }
    }
}
