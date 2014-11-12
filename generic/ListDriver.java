package generic;

import generic.List;

public class ListDriver{
    public static void main(String[] args){
        List<String> mylist = new List<String>(5);
        mylist.add("Milk");
        mylist.add("Eggs");
        System.out.println(mylist.toString());
        List<Integer> numbers = new List<Integer>(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers.toString());
    }
}
