public class _static {
    private String first, last;
    private static int members = 0; // static: data is shared between all objects.

    public _static(String fn, String ln){
        first = fn;
        last = ln;
        members++;
        System.out.printf("Constructor for %s %s, members in the club: %d \n", first, last, members);
    }
    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
    public static int getMembers(){
        return members;
    }
}
