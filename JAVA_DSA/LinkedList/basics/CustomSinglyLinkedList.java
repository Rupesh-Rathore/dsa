package JAVA_DSA.LinkedList.basics;

public class CustomSinglyLinkedList {
    
    // Pointers to operate on LL
    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public CustomSinglyLinkedList() {
        this.size = 0;
    }

    // ⁡⁢⁣⁣METHODS⁡ 

    // ⁡⁣⁣⁡⁣⁣⁢Insertion-Methods⁡
    
    public void insertFirst(int val){
        // method to insert at the start of the linkedList
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }
        size++;
    }
    
    public void insertLast(int val){
        // method to insert a node at the end of the linked list using tail (O(1))
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    
    public void insertLastWithOutTail(int val){
        // method to insert a node at the end of the linked list without using tail (O(n))
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        tail = node;
        size++;
    }
    
    public void insert(int val , int index){
        // Method to insert a node at a perticular position or index (0,1,2,3,4,...)
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    // My logic
    public void insertRec(int val , int index , int pro , Node proNode) {
        // insert using recursion
        if (index == 0) {
            Node node = new Node(val);
            node.next = head;
            head = node;
            size++;
            return; 
        }
        if ( pro == index - 1) {
            Node node = new Node(val);
            node.next = proNode.next;
            proNode.next = node;
            size++;
            return;
        }
        proNode = proNode.next;
        insertRec(val, index, pro+1, proNode);
        return;
    }

    //kushwah's logic
    public void insertRec(int val,int index){
        head = insertRec(val, index , head);
    }
    private Node insertRec(int val ,int index,  Node node) {
        // insert using recursion
        if (index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val,index-1, node.next);
        return node;
    }

    // ⁡⁣⁣⁢Deletion-Methods⁡

    public int removeFirst(){
        // method to remove or delete first node/element of the linked list
        int deletedVal = head.val;
        Node temp = head;
        head = temp.next;
        if(head == null){
            tail = null;
        }
        size--;
        return deletedVal;
    }

    public int removeLast(){
        // method to remove or delete last node/element of the linked list
        if (size <= 1){
            return removeFirst();
        }
        Node secondLast = get(size - 1);
        int deletedVal = tail.val;
        tail = secondLast;
        tail.next = null;
        size--;
        return deletedVal;
    }

    public int remove(int index){
        if (index == 0) return removeFirst();
        if (index == size - 1) return removeLast();
        Node precidingNode = get(index);
        int deletedVal = precidingNode.next.val;
        precidingNode.next = precidingNode.next.next;
        size--;
        return deletedVal;
    }

    // ⁡⁣⁣⁢Access-methods⁡

    public Node get(int index) {
        // method to get reference to any node via index
        if (index == 0) return head;
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    
    public int valueAt(int index) {
        // method to return value of the node at the given index
        return get(index).val;
    }

    public Node find(int value) {
        // method that returns the node that has the val == value , if not fount returns null
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public int size(){
        // method to return size of the linked list
        return size;
    }
    
    // ⁡⁣⁣⁡⁣⁣⁡⁣⁣⁢Dispaly-methods⁡

    public void display(){
        // method to display the linked list
        Node temp = head;
        while ( temp != null ) {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print("END - SIZE "+this.size+"\n");
    }

    // Node class 
    private class Node{
        // Data members
        private int val;
        private Node next;

        // Constructors 
        public Node (int value){
            this.val = value;
        }
        public Node (int value , Node next) {
            this.val = value;
            this.next = next;
        }
    }
}
