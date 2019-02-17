import java.util.EnumSet;

public class EnumMain {
    public static void main(String[] args){
        for (EnumGary people: EnumGary.values())
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());

        System.out.println("\nAnd now for the range of constants!!!\n");

        for(EnumGary people: EnumSet.range(EnumGary.jennifer, EnumGary.candy))
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());


    }
}
