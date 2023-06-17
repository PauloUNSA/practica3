public class Item<E> implements Comparable<Item<E>> {

    private E data;
    private int priority;

    public Item (E data, int p) {
        this.data = data;
        this.priority = p;
    }

    public E getData () {
        return this.data;
    }

    public int getPriority() {
        return this.priority;
    }

    @Override
    public int compareTo(Item<E> e) {
        if (e == null) {
            throw new NullPointerException("El argumento no puede ser nulo");
        }
        return this.priority-e.getPriority();
    }

    @Override
    public String toString() {
        return " "+this.priority+"-"+this.data.toString();
    }
}
