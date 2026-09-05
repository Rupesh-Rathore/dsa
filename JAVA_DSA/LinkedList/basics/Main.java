package JAVA_DSA.LinkedList.basics;

public class Main {
    public static void main(String[] args) {
        CustomSinglyLinkedList list = new CustomSinglyLinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.display();
        list.insertRec(0,2);
        list.display();
    }
}
