// Class to Hold Objects
// https://www.youtube.com/watch?v=slY5Ag7IjM0&index=59&list=PLFE2CE09D83EE3E28

public class ClassToHoldObjects {
    public static void main(String[] args){
        DogList DLO = new DogList();
        Dog d = new Dog();
        DLO.add(d);

        AnimalList ALO = new AnimalList();
        Fish f = new Fish();
        ALO.add(d);
        ALO.add(f);

    }
}
