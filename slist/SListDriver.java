package slist;

import slist.SList;

public class SListDriver{
    public static void main(String[] args){
        SList<Integer> slist = new SList<Integer>();
        slist.append(new Integer(10));
        slist.append(new Integer(20));
        slist.append(new Integer(30));
        slist.display();

        for(Object n: slist.getItems()){
            System.out.println(((Integer)n).toString());
        }

        SList<String> slist2 = new SList<String>();
        slist2.append("Vijayendra");
        slist2.append("Tushar");
        slist2.append("Bapte");
        slist2.display();
    }
}
