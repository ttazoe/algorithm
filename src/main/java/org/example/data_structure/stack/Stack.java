package org.example.data_structure.stack;

public class Stack {
    int[] stack;
    int top;

    public Stack(int size) {
        stack = new int[size];
        top = 0;
    }

    public boolean isFull(){
        return top == stack.length - 1;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public void push(int x) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is already full");
        }
        top++;
        stack[top] = x;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        int result = stack[top];
        top--;
        return result;
    }
}
