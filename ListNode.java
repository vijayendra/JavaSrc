// This is a linked list example
// Linked list has certain advantages over Array
// such as you dont have to define its lenght and
// insertions are not that expensive

class ListNode{
    public int item;
    public ListNode next;

    public ListNode(int item, ListNode next){
        this.item = item;
        this.next = next;
    }
    public ListNode(int item){
        this(item, null); // null is equivalent to None in Python
    }

    public void insertNext(int item){
        next = new ListNode(item, next);
    }
    public void insertNext(ListNode ln){
        ln.next = next;
        next = ln; 
    }
    public void display(){
        ListNode ln = this;
        while (true){
            System.out.print(ln.item);
            if (ln.next == null)
                break;
            System.out.print(" -> ");
            ln = ln.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        ListNode l1 = new ListNode(10);
        ListNode l2 = new ListNode(20);
        l1.next = l2;
        ListNode l3 = new ListNode(30);
        l2.next = l3;
        l1.display();
        l2.insertNext(25);
        l1.display();
        l2.insertNext(new ListNode(22));
        l1.display();
    }
}
