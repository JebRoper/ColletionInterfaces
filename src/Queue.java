import java.util.LinkedList;
import java.util.List;

public class Queue<E> {

    List<E> queue = new LinkedList<>();

    public void add(E e) {
        queue.add(e);
    }

    public E remove() {
        if (queue.isEmpty()){
            return null;
        }
        return queue.remove(0);
    }

    @Override
    public String toString() {
        return "queue=" + queue +
                '}';
    }
}
