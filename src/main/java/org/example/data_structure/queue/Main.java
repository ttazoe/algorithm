package org.example.data_structure.queue;

public class Main {
    public static void main(String[] args) throws Exception {
        Process a = new Process("A", 150);
        Process b = new Process("B", 80);
        Process c = new Process("C", 200);
        Process d = new Process("D", 200);

        Queue queue = new Queue(4);

        int queueTime = 100;

        queue.enqueue(a);
        queue.enqueue(b);
        queue.enqueue(c);
        queue.enqueue(d);

        System.out.println(queue);

        while (!queue.isEmpty()) {
            Process process = queue.dequeue();
            Process updatedProcess = process.subtractTime(queueTime);
            if (!updatedProcess.isCompleted()) {
                queue.enqueue(updatedProcess);
            }
            System.out.println(queue);
            System.out.println(queue.head + "," + queue.tail);
        }
    }
}
