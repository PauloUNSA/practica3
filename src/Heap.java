public interface Heap<E> {
    void insert(E e);
    E remove();
    boolean isEmpty();
}
