public class _staticMain {
    public static void main(String[] args){
        _static member1 = new _static("Megan","Fox");
        _static member2 = new _static("Natalie", "Portman");
        _static member3 = new _static("Taylor", "Swift");

        System.out.println();
        System.out.println(member1.getFirst());
        System.out.println(member1.getLast());
        System.out.println(member1.getMembers());
    }
}
