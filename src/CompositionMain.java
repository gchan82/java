public class CompositionMain {
    public static void main(String[] args){
        CompositionCalendarFormat CalendarObject = new CompositionCalendarFormat(4,5,6);
        CompositionBirthday BirthdayObject = new CompositionBirthday("Gary", CalendarObject);

        System.out.println(BirthdayObject);

    }
}
