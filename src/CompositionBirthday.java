public class CompositionBirthday {
    private String name;
    private CompositionCalendarFormat birthday;

    public CompositionBirthday(String theName, CompositionCalendarFormat theDate){
        name = theName;
        birthday = theDate;
    }

    public String toString(){
        return String.format("My name is %s, my birthday is %s", name, birthday);
    }
}
