package btree;

import btree.Node;

public class NodeDriver{
    public static void main(String[] args){
        Node<Integer> n = new Node<Integer>(new Integer(10));
        assert n.left == null;
        assert n.right == null;
        assert n.parent == null;

        Node<Integer> n1 = new Node<Integer>(new Integer(12), n);
        assert n1.parent == n;

        Node<Integer> n2 = new Node<Integer>(new Integer(15), n);
        n.add(n2);
        assert n2.parent == n;
        
    }
}
