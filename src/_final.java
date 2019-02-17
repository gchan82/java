public class _final {
    private int sum;
    private final int NUMBER;

    public _final(int x){
        NUMBER = x;
    }

    public void add(){
        sum+=NUMBER;
    }
    public String toString(){
        return String.format("sum = %d\n", sum);
    }

}
