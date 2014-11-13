package slist;

import slist.Node;

class SListNode<E> extends Node<E>{
    E item;
    SListNode<E> next;

    public SListNode(E item){
        this.item = item;
    }
    public SListNode(){
        item = null;
        next = this;
    }
}
