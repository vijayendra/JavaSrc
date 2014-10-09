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
    public void push(int item){
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
    public DListNode pop() throws RuntimeException{
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
        DList dl = new DList();
        dl.display();
        dl.push(2);
        dl.display();
        dl.push(5);
        dl.display();
        dl.push(10);
        dl.display();
        DList other = new DList();
        other.push(2);
        assert !dl.equals(other);
        other.push(5);
        assert !dl.equals(other);
        other.push(10);
        assert dl.equals(other);
        dl.pop();
        dl.display();
        dl.pop();
        dl.display();
    }
}

class TestDList{
    public static void main(String[] args){
        System.out.println("Testing");
        DList.testDriver();
    }
}
