package slist;

abstract class List{
    protected int size;
    abstract public int getSize();
    abstract public void append(Object item);
    abstract public void display();
}
