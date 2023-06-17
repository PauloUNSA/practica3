import java.util.ArrayList;

// Implementación del TAD Heap maximo
class MaxHeap<E extends Comparable<E>> implements Heap<E>{
    private ArrayList<E> heap;
    private int size;

    public MaxHeap() {
        this.heap = new ArrayList<>();
    }

    public E getRoot() {
        if (isEmpty()) {
            throw new NullPointerException("El heap está vacío");
        }
        return heap.get(0);
    }

    @Override
    public void insert(E e) {
        heap.add(e);
        size++;
        ascend(size-1);
               
    }

    private void ascend(int i) {
        int parent = (i - 1) / 2;
        while (i>0 && (heap.get(i).compareTo(heap.get(parent))<0)) {
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

        if (size == 1) {
            return heap.remove(0);
        }

        E temp = heap.get(0);
        heap.set(0, heap.remove(size-1));
        descend(0);

        return temp;
    }

    private void descend (int parent) {
        int left, right;
        int posLeft = (parent*2)+1;
        int posRight = (parent*2)+2;

        while (posLeft<size) {
            left = heap.get(posLeft).compareTo(heap.get(parent));
            right = heap.get(posRight).compareTo(heap.get(parent));

            if (left>0) { // caso cuando el hijo de la izquierda es mayor
                swap(parent, posLeft);
                parent = posLeft;
            }
            else if (right>0) { //caso cuando el hijo de la derecha es mayor
                swap(right, posRight);
                parent = posRight;
            }
            else { //caso cuando ambos hijos son mayores al padre
                break;
            }
            posLeft = (parent*2)+1;
            posRight = (parent*2)+2;
        }
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

    @Override
    public String toString () {
        return this.heap.toString();
    }
}