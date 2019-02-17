public class PolymorphismMain {
    public static void main(String[] args){
        PolymorphismFatty Gary = new PolymorphismFatty();
        PolymorphismFood fo = new PolymorphismFood();
        PolymorphismPotpie po = new PolymorphismPotpie();

        Gary.digest(fo);
        Gary.digest(po);

    }
}
