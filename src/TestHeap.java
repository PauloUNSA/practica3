public class TestHeap {
    public static void main(String[] args) {
        PriorityQueueHeap<Integer> priorityQueue = new PriorityQueueHeap<>();
        priorityQueue.enqueue(1,3);
        ultimo(priorityQueue);
        primero(priorityQueue);

        priorityQueue.enqueue(13,2);
        ultimo(priorityQueue);
        primero(priorityQueue);

        priorityQueue.enqueue(12,5);
        ultimo(priorityQueue);
        primero(priorityQueue);

        priorityQueue.enqueue(11,5);
        ultimo(priorityQueue);
        primero(priorityQueue);

        priorityQueue.enqueue(10,1);
        ultimo(priorityQueue);
        primero(priorityQueue);
    }
    private static void ultimo(PriorityQueueHeap<Integer> p){
        System.out.println(p.back());
    }
    private static void primero(PriorityQueueHeap<Integer> p){
        System.out.println(p.front());
    }
}
