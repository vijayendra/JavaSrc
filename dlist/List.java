package dlist;

import dlist.DListNode;
    
abstract class List{
    protected int size;
    abstract public int getSize();
    abstract public void insertFront(int item);
    abstract public void display();
    abstract public DListNode remove();
}
