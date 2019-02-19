// LinkedList Program
// https://www.youtube.com/watch?v=rW2OppsgJjQ&list=PL27BCE863B6A864E3&index=7

// Converting Lists to Arrays
// https://www.youtube.com/watch?v=Sj2kCLjZZgk&list=PL27BCE863B6A864E3&index=8

package LinkedList;

import java.util.*;

public class LinkLists {
    public static void main(String[] args){
        String[] things = {"apples","noobs", "pwnge","bacon","goats"};
        List<String> list1 = new LinkedList<String>();
        for(String x: things)
            list1.add(x);

        String[] things2 = {"sausage", "bacon","goat","harrypotter"};
        List<String> list2 = new LinkedList<String>();
        for(String y: things2)
            list2.add(y);

        list1.addAll(list2);
        list2 = null;

        printMe(list1);
        removeStuff(list1,2,5);
        printMe(list1);
        reverseMe(list1);
    }

    //printMe method
    private static void printMe(List<String> l){
        for(String b: l)
            System.out.printf("%s ",b);
        System.out.println();
    }
    // removeStuff method
    private static void removeStuff(List<String> l, int from, int to){
        l.subList(from, to).clear();
    }

    //reverseMe
    private static void reverseMe(List<String> l){
        ListIterator<String> bobby = l.listIterator(l.size());
        while(bobby.hasPrevious())
            System.out.printf("%s ", bobby.previous());
    }
}
