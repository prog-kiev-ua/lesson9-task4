package ua.kovalev;

import java.util.ArrayDeque;

public class DemoDeque {
    private ArrayDeque<String> queue = new ArrayDeque<>();

    public DemoDeque() {
        super();
        queue.add("Sheldon");
        queue.add("Leonard");
        queue.add("Volovitc");
        queue.add("Kutrapalli");
    }

    @Override
    public String toString() {
        return "DemoDeque{" +
                "queue=" + queue +
                '}';
    }

    public void drink(){
        String str = queue.pop();
        queue.addLast(str);
        queue.addLast(str);
    }

    public ArrayDeque<String> getQueue() {
        return queue;
    }

    public void setQueue(ArrayDeque<String> queue) {
        this.queue = queue;
    }
}
