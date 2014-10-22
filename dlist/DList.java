package dlist;

import dlist.List;
    
class DList extends List{
    private DListNode head;
    private int size;

    public DList(){
        head = new DListNode();
        size = 0;
    }

    public int getSize(){
        return size;
    }
    public void insertFront(int item){
        DListNode n = new DListNode(item);
        if (size == 0){
            head.prev = n;
            head.next = n;
            n.next = head;
            n.prev = head;
        } else {
            head.prev.next = n;
            n.prev = head.prev;
            n.next = head;
            head.prev = n;
        }
        size++;
    }
    public DListNode remove() throws RuntimeException{
        DListNode n;
        if (size == 0){
            throw new RuntimeException("Node list size is 0");
        } else {
            n = head.prev;
            head.prev = n.prev;
            n.prev.next = head;
            size--;
            return n;
        }
    }
    public void display(){
        if (size > 0){
            DListNode i = head.next;
            while (true)
                if (i.next == head){
                    // last item
                    System.out.print(i.item);
                    break; // come out of while loop
                } else {
                    System.out.print(i.item+" <-> ");
                    i = i.next;
                }
        }
        System.out.println();
    }
    public boolean equals(DList other){
        DListNode i, j;
        if (size != other.size){
            return false;
        }
        if (head.item != other.head.item){
            return false;
        }
        i = head.next;
        j = other.head.next;
        while (head != head.next){
            if (i.item != j.item){
                return false;
            }
        }
        return true;
    }
    public static void testDriver(){
        // testDriver must be present in actual class so that it can call
        // private methods if any.
        DList dl = new DList();
        dl.display();
        dl.insertFront(2);
        dl.display();
        dl.insertFront(5);
        dl.display();
        dl.insertFront(10);
        dl.display();
        DList other = new DList();
        other.insertFront(2);
        assert !dl.equals(other);
        other.insertFront(5);
        assert !dl.equals(other);
        other.insertFront(10);
        assert dl.equals(other);
        dl.remove();
        dl.display();
        dl.remove();
        dl.display();
    }
    public static void main(String[] args){
        System.out.println("Main method");
        testDriver();
    }
}
