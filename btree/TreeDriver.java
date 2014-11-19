package btree;

import btree.Tree;

/*
            10
           /  \
          /    \  
         /      \
        5       15
       / \     /  \
      3   7  13    17
     / \    /  \
    2   4  11  14

*/
    

public class TreeDriver{
    public static void main(String[] args){
        Tree<Integer> t = new Tree<Integer>();
        Integer[] items = {10, 5, 15, 3, 7, 13, 17, 2, 4, 11, 14};
        for(Integer item: items){
            t.add(item);
        }
        t.preorder();
        t.postorder();
        t.inorder();
    }
}
