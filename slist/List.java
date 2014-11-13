package slist;

abstract class List<E>{
    protected int size;
    abstract public int getSize();
    abstract public void append(E item);
    abstract public void display();
}
