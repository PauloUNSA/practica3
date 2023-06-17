import java.util.ArrayList;

// Implementación del TAD Heap genérico
class MaxHeap<E extends Comparable<E>> implements Heap<E>{
    private ArrayList<E> heap;

    public MaxHeap() {
        this.heap = new ArrayList<>();
    }

    @Override
    public void insert(E e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public E remove() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean isEmpty() {
        return this.heap.isEmpty();
    }
}