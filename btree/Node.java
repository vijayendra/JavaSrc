package btree;

class Node<E extends Comparable<E>>{
    Node<E> parent;
    E item;
    Node<E> right;
    Node<E> left;

    public Node(E i){
        item = i;
    }

    public E getItem(){
        return item;
    }

    public Node(E i, Node<E> p){
        item = i;
        parent = p;
    }

    public int compare(E i, E j){
        return i.compareTo(j);
    }

    public void add(Node<E> n){
        if(compare(n.item, item) <= 0){
            // insert to left
            if(left != null){
                left.add(n);
            } else {
                left = n;
                left.parent = this;
            }
        } else {
            // insert to right
            if(right != null){
                right.add(n);
            } else {
                right = n;
                right.parent = this;
            }
        }
    }

    public void display(){
        System.out.print(item.toString() + " ");
    }
    
    public void preorder(){
        display();
        if (left != null)
            left.preorder();
        if (right != null){
            right.preorder();
        }
    }

    public void postorder(){
        if (left != null)
            left.postorder();
        if (right != null){
            right.postorder();
        }
        display();
    }

    public void inorder(){
        if (left != null){
            left.inorder();
        }
        display();
        if (right != null){
            right.inorder();
        }
    }
}
