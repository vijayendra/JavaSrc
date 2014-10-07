// This is a circular DList with following invariants:

// 1. DList head cannot be null
// 2. Sentinel item value will be null
// 3. Sentinel next and prev will point to itself if DList size is 0
// 4. Evey DListNode will have next and prev which are non null
// 5. If x.next = y then y.prev = x
// 6. If x.prev = y then y.next = x

class DListNode{
    int item;
    DListNode next;
    DListNode prev;
    public DListNode(int item){
        this.item = item;
    }
    public DListNode(){
        this.next = this;
        this.prev = this;
    }
}

class DList{
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
    public static void main(String[] args){
        // starting point
        DList dl = new DList();
        dl.display();
        dl.insertFront(2);
        dl.display();
        dl.insertFront(5);
        dl.display();
        dl.insertFront(10);
        dl.display();
    }
}
