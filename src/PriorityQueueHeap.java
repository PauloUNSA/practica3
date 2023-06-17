// Implementación de la clase PriorityQueueHeap
class PriorityQueueHeap<E > {
    private MaxHeap<Item<E>> queue;

    public PriorityQueueHeap() {
        queue = new MaxHeap<>();
    }

    public void enqueue (E e, int p) {
        Item<E> temp = new Item<>(e, p);
        queue.insert(temp);
    }

    public E dequeue() {
        return queue.remove().getData();
    }

    public E front() {
        return queue.getRoot().getData();
    }

    public E back() {
        return queue.getEnd().getData();
    }
}