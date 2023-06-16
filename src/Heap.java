import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    ArrayList<T> heaps;

    public Heap(ArrayList<T> heaps) {
        this.heaps = heaps;
    }
}
