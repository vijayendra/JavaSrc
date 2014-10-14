package dlist;

import dlist.Node;

class DListNode extends Node{
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
