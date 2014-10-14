package dlist;

import dlist.DListNode;
    
abstract class List{
    protected int size;
    abstract public int getSize();
    abstract public void push(int item);
    abstract public void display();
    abstract public DListNode pop();
}
