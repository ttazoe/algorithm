package org.example.data_structure.queue;

import java.util.Arrays;

public class Queue {
    Process[] queue;
    int head;
    int tail;

    public Queue(int length){
        queue = new Process[length + 1];
        head = 0;
        tail = 0;
    }

    public boolean isFull(){
        // 配列を一周して tail が head の一番後ろについたら終了
        if (head == 0 && tail == queue.length - 1) {
            return true;
        }
        return (tail == head - 1);
    }

    public boolean isEmpty(){
        return head == tail;
    }

    public boolean isQueueEnd(int index){
        return index == queue.length;
    }

    public void enqueue(Process process) throws Exception {
        if(isFull()) {
            throw new Exception("Queue is full");
        }
        queue[tail] = process;
        tail++;
        if (isQueueEnd(tail)){
            tail = 0;
        }
    }

    public Process dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        Process result = queue[head];
        head++;
        if (isQueueEnd(head)) {
            head = 0;
        }
        return  result;
    }


    @Override
    public String toString() {
        return "Queue{" +
                "queue=" + Arrays.toString(queue) +
                '}';
    }
}
