package compareObj.exer;

public class ComparebleCircle extends Circle implements CompareObject{

    public ComparebleCircle(int redius) {
        super(redius);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
