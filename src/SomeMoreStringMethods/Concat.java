package SomeMoreStringMethods;

public class Concat {
    public static void main(String[] args){
        String a = "Bacon ";
        String b = "monster";

        System.out.println(a.concat(b));
        System.out.println(a.replace('B','F'));
        System.out.println(b.toUpperCase());
        System.out.println(b.trim()); // removes spaces
    }
}
