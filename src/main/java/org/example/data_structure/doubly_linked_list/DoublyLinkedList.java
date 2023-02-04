package org.example.data_structure.doubly_linked_list;

import java.util.Objects;

public class DoublyLinkedList {
    class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    Node head, tail;



    // Insert node at the top.
    public void insert(int x) {
        Node insertNode = new Node(x);

        if (tail == null) {
            tail =insertNode;
        }

        if (head.next != null) {
            head.next.prev = insertNode;
            insertNode.next = head.next;
        }

        head.next = insertNode;
        insertNode.prev = head;
    }

    public void deleteFirst() throws Exception {
        if (Objects.isNull(head.next)) {
            throw new Exception("list is empty");
        }

        Node targetNode = head.next;

        targetNode.prev = null;
        head.next = null;

        if (Objects.nonNull(targetNode.next)) {
            head.next = targetNode.next;
            targetNode.next.prev = head;
            targetNode.next = null;
        }
    }





    public void delete(int x) {

    }

    public void deleteLast() throws Exception{
        if (Objects.isNull(head.next)) {
            throw new Exception("list is empty");
        }
    }
}
