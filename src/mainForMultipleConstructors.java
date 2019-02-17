package arrays;

public class mainForMultipleConstructors {
    public static void main(String[] args) {
        multipleConstructors multipleConstructorsObject = new multipleConstructors();
        multipleConstructors multipleConstructorsObject2 = new multipleConstructors(5);
        multipleConstructors multipleConstructorsObject3 = new multipleConstructors(5,13);
        multipleConstructors multipleConstructorsObject4 = new multipleConstructors(5,13,43);

        System.out.printf("%s\n", multipleConstructorsObject.toMilitary());
        System.out.printf("%s\n", multipleConstructorsObject2.toMilitary());
        System.out.printf("%s\n", multipleConstructorsObject3.toMilitary());
        System.out.printf("%s\n", multipleConstructorsObject4.toMilitary());
    }
}
