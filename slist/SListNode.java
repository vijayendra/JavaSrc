package slist;

import slist.Node;

class SListNode extends Node{
    Object item;
    SListNode next;

    public SListNode(Object item){
        this.item = item;
    }
    public SListNode(){
        item = null;
        next = this;
    }
}
