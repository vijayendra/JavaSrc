package slist;

import slist.List;
import slist.SListNode;

public class SList extends List{
    private int size;
    private SListNode head; // head will point to 1st item in list
    private SListNode tail; // tail will point to last item in list
    
    public SList(){
        head = null;
        tail = null;
        size = 0;
    }
    public int getSize(){
        return size;
    }
    public void append(Object item){
        SListNode n = new SListNode(item);
        if(size == 0){
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }
    public void display(){
        if(size != 0){
            SListNode n = head;
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
    public static void main(String[] args){
        SList slist = new SList();
        slist.append(10);
        slist.append(20);
        slist.append(30);
        slist.display();
    }
}
