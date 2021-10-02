package main.lab02;

import java.util.Arrays;

public class Queue<T> {

    public Object[] queue;
    public Integer size = 0;
    public Integer front = 0;
    public Integer index;

    public Queue(Integer max) {
        this.queue = new Object[max];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == this.queue.length;
    }

    public void add(T element) {
        if (this.size == this.queue.length) {
            System.out.println("Queue is Full! Cannot add the element.");
        }

        index = (front + this.size) % this.queue.length;
        this.queue[index] = element;
        this.size++;
    }

    public T pop() {
        if (this.size == 0) {
            return null;
        } else {
            // Return the last not null element from the list
            for (int i = this.queue.length - 1; i > -1; i--) {
                if (this.queue[i] != null) {
                    T elem = (T) queue[i];
                    this.queue[i] = null;
                    this.size--;
                    return elem;
                }
            }
        }
        return null;
    }

    public void display() {
        System.out.println(Arrays.toString(this.queue));
    }

}

