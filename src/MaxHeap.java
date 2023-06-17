import java.util.ArrayList;

// Implementación del TAD Heap maximo
class MaxHeap<E extends Comparable<E>> implements Heap<E>{
    private ArrayList<E> heap;
    private int size;

    public MaxHeap() {
        this.heap = new ArrayList<>();
    }

    @Override
    public void insert(E e) {
        heap.add(e);
        size++;
        ascend(size-1);
               
    }

    private void ascend(int i) {
        int parent = (i - 1) / 2;
        while (i>0 && (heap.get(i).compareTo(heap.get(parent)) <= 0)) {
            swap(i, parent);
            i = parent;
            parent = (i - 1) / 2;
        }
    }

    @Override
    public E remove() {
        if (isEmpty()) {
            throw new NullPointerException("El heap está vacío");
        }
        E temp = heap.get(0);
        heap.set(0, heap.remove(size-1));

        descend(0)

        return temp;
    }

    private void descend (int i) {
        
    }

    private void swap (int i, int k) {
        E temp = heap.get(i);
        heap.set(i, heap.get(k));
        heap.set(k, temp);
    }

    @Override
    public boolean isEmpty() {
        return this.heap.isEmpty();
    }
}