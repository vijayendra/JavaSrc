package btree;

import btree.Node;

class Tree<E extends Comparable<E>>{
    private Node<E> root;

    public void add(E item){
        Node<E> n = new Node<E>(item);
        if (root == null){
            root = n;
        } else {
            root.add(n);
        }
    }
    public void preorder(){
        if(root != null){
            System.out.println("Preorder: ");
            root.preorder();
            System.out.println();
        }
    }

    public void postorder(){
        if(root != null){
            System.out.println("Postorder: ");
            root.postorder();
            System.out.println();
        }
    }

    public void inorder(){
        if(root != null){
            System.out.println("Inorder: ");
            root.inorder();
            System.out.println();
        }
    }

}
