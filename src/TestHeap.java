public class TestHeap {
    public static void main(String[] args) {
        PriorityQueueHeap<Integer> priorityQueue = new PriorityQueueHeap<>();
        priorityQueue.enqueue(10,1);
        ultimo(priorityQueue);
        primero(priorityQueue);

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
        priorityQueue.enqueue(100,1);
        ultimo(priorityQueue);
        primero(priorityQueue);
        PriorityQueueHeap<Persona> p = new PriorityQueueHeap<>();
        Persona[] per = {new Persona(11,"Juan"),new Persona(19,"Paulo"),
                new Persona(18,"Andre"),new Persona(91,"Joel")};
        p.enqueue(per[0],per[0].getPriority());
        System.out.println("Menor prioridad: "+p.back());
        System.out.println("Mayor prioridad: "+p.front());
        p.enqueue(per[1],per[1].getPriority());
        System.out.println("Menor prioridad: "+p.back());
        System.out.println("Mayor prioridad: "+p.front());
        p.enqueue(per[2],per[2].getPriority());
        System.out.println("Menor prioridad: "+p.back());
        System.out.println("Mayor prioridad: "+p.front());
        p.enqueue(per[3],per[3].getPriority());
        System.out.println("Menor prioridad: "+p.back());
        System.out.println("Mayor prioridad: "+p.front());




    }
    private static void ultimo(PriorityQueueHeap<Integer> p){
        System.out.println("Menor prioridad: "+p.back());
    }
    private static void primero(PriorityQueueHeap<Integer> p){
        System.out.println("Mayor prioridad: "+p.front());
    }
}
