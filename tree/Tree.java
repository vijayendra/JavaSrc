package tree;

import tree.Node;

class Tree{
    Node root;
    public Tree(String name){
        root = new Node("root");
    }
    public static void main(String[] args){
        Tree t = new Tree("/");
        Node a = t.root.addChild("a");
        Node b = t.root.addChild("b");
        Node a1 = a.addChild("a1");
        Node a2 = a.addChild("a2");
        Node b1 = b.addChild("b1");
        Node b2 = b.addChild("b2");
        Node b3 = b.addChild("b3");
        Node b4 = b.addChild("b4");
        t.root.preorder();
    }
}
