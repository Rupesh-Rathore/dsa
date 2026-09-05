package JAVA_DSA.LinkedList.questions;

import java.util.HashMap;

public class HappyNumber {
    Node head;
    int size;
    HashMap<Integer , Integer> sqSumsFreq = new HashMap<>();

    public int middleNode() {
        int size = size(head);
        if (size == 0) return 0;
        int mid = 0;
        if (size % 2 == 0) {
            mid = (1 + (size - 1) / 2) + 1;
        }
        else {
            mid = 1 + (size - 1) / 2;
        }

        Node temp = head;
        while (mid > 1) {
            temp = temp.next;
            mid--;
        }

        return temp.val;
        
    }
    public int size(Node node) {
        if (node == null) return 0;
        int size = 0;
        Node temp = node;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    private class Node{
        int val;
        Node next;

        Node(int value) {
            this.val = value;
        }

        Node (int value, Node nextNode) {
            this.val = value;
            this.next = nextNode;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            node.next = null;
            size++;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }

    public void display(){
        Node node = head;

        while(node != null) {
            System.out.printf("[%d] -> ",node.val);
            node = node.next;
        }
        System.out.printf("End - Size : %d", this.size);
        System.out.println();
    }
}
