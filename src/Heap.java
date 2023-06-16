import java.util.ArrayList;
import java.util.NoSuchElementException;

// Implementación del TAD Heap genérico
class Heap<T extends Comparable<T>> implements TDAHeap<T>{
    private ArrayList<T> heap;

    public Heap() {
        heap = new ArrayList<>();
    }
    public void insertar(T element) {
        heap.add(element);
        insert(heap.size() - 1);
    }
    public T borrar() {
        if (isEmpty()) {
            throw new NoSuchElementException("No hay elementos.");
        }
        T eliminado = heap.get(0);
        T ultimo = heap.remove(heap.size() - 1);
        if (!isEmpty()) {
            heap.set(0, ultimo);
            eliminar(0);
        }
        return eliminado;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }

        return heap.get(0);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void insert(int index) {
        int indicePadre = (index - 1) / 2;
        while (index > 0 && heap.get(index).compareTo(heap.get(indicePadre)) > 0) {
            swap(index, indicePadre);
            index = indicePadre;
            indicePadre = (index - 1) / 2;
        }
    }

    private void eliminar(int index) {
        int indiceHijoDerecho = 2 * index + 1;
        int indiceHijoIzquierdo = 2 * index + 2;
        int indicePadre = index;
        if (indiceHijoDerecho < heap.size() && heap.get(indiceHijoDerecho).compareTo(heap.get(indicePadre)) > 0) {
            indicePadre = indiceHijoDerecho;
        }
        if (indiceHijoIzquierdo < heap.size() && heap.get(indiceHijoIzquierdo).compareTo(heap.get(indicePadre)) > 0) {
            indicePadre = indiceHijoIzquierdo;
        }
        if (indicePadre != index) {
            swap(index, indicePadre);
            eliminar(indicePadre);
        }
    }

    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}