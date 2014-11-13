package slist;

import slist.List;
import slist.SListNode;

public class SList<E> extends List<E>{
    private int size;
    private SListNode<E> head; // head will point to 1st item in list
    private SListNode<E> tail; // tail will point to last item in list
    
    public SList(){
        head = null;
        tail = null;
        size = 0;
    }
    public int getSize(){
        return size;
    }
    public void append(E item){
        SListNode<E> n = new SListNode<E>(item);
        if(size == 0){
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }
    public Object[] getItems(){
        Object[] result = new Object[size];
        if (size != 0){
            SListNode<E> n = head;
            for(int i=0; i<size; i++){
                result[i] = n.item;
                n = n.next;
            }
        }
        return result;
    }
    public void display(){
        if(size != 0){
            SListNode<E> n = head;
            while (true){
                System.out.print(n.item.toString());
                if (n.next == null)
                    break;
                else{
                    System.out.print("->");
                    n = n.next;
                }
            }
            System.out.println();
        }
    }
}
