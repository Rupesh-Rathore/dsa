package JAVA_DSA.LinkedList.questions;

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
    private void deleteDuplicatesLoop(Node head) {
        Node node = head;

        /*
        KUSHWAHA'S LOGIC
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }
            tail = node;
            tail.next = null;
        */
        while ( node.next != null ){
            Node temp = node;
            while(temp.next.val == temp.val){
                temp = temp.next;
                size--;
            }
            node.next = temp.next;
            node = temp.next;
        }
        tail = node;
        tail.next = null;
    }
    public void deleteDuplicates(){
        Node node = deleteDuplicates(head);
    }
    private Node deleteDuplicates(Node node) {
        if (node == null) {
            return node;
        }
        if (node.next == null) {
            return node;
        }

        Node temp = deleteDuplicates(node.next);
        if (node == head) {
            if (temp.val == node.val) {
                size--;
                head = temp;
                return head;
            }
        }
        if (temp.val == node.val) {
            size--;
            return temp;
        }

        node.next = temp;
        return node;
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
    public Node middleNode() {
        int size = size(head);
        if (size == 0) return null;
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

        return temp;
        
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
    public Node middleNodeForSort(Node head) {
            Node s = head;
            Node f = head;
            Node temp = head;
            while (f != null && f.next != null) {
                temp = s;
                s= s.next;
                f = f.next.next;
            }
            temp.next = null;
            return s;
    }
    // ⁡⁣⁣⁡⁣⁣⁡⁣⁣⁢Dispaly-methods⁡

    public void display(Node node){
        // method to display the linked list
        Node temp = node;
        while ( temp != null ) {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print("END - SIZE "+this.size+"\n");
    }
    public void display(){
        // method to display the linked list
        Node temp = head;
        while ( temp != null ) {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print("END - SIZE "+this.size+"\n");
    }

    // Cyclic Methods

    public boolean hasCycle() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                System.out.println("Cyclic LinkedList");
                return true;
            }
        }
        System.out.println("Not a Cyclic LinkedList");
        return false;
    }
    public boolean hasCycle(Node fast , Node slow) {
        fast = head;
        slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                System.out.println("Cyclic LinkedList");
                return true;
            }
        }
        System.out.println("Not a Cyclic LinkedList");
        return false;
    }
    public void createCycle(int index){
        if (index == 0){
            tail.next = head;
            return;
        }
        if (index == size){
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        tail.next = temp.next;
    } 
    public int cycleSize() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                System.out.println("Cyclic size");
                Node temp = slow;
                int size = 1;
                slow = slow.next;
                while (slow != temp){
                    size++;
                    slow = slow.next;
                }
                return size;
            }
        }
        System.out.println("Not a Cyclic LinkedList");
        return 0;
    }
    public Node cycleStart() {
        Node fast = head;
        Node slow = head;

        if (!hasCycle(fast, slow)) {
            return null;
        }
        int size = cycleSize();
        Node first = head;
        Node second = head;

        for (int i = 1; i <= size; i++) {
            second = second.next;
        }
        while (first != second) {
            second = second.next;
            first = first.next;
        }

        return first;
    }
    
    // List manipulation

    public Node mergeTwoLists(Node list1, Node list2) {
        Node dummyHead = new Node();
        Node tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }
            else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        if (list1 != null) {
            tail.next = list1;
        }
        if(list2 != null) {
            tail.next = list2;
        }
        return dummyHead.next;
    }
    public void reverseRecursive(Node node){
        if (node == tail) {
            head = tail;
            return;
        }

        reverseRecursive(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }
    public void callerForReverser(){
        tail = reverseRecurisveNoTail(head);
        tail.next = null;
    }
    private Node reverseRecurisveNoTail(Node node) {
        if (node.next == null) {
            head = node;
            return node;
        }

        Node nextNode = reverseRecurisveNoTail(node.next);
        nextNode.next = node;
        node.next = null;
        return node;
    }
    public void reverse(Node node) {
        if (size < 2) {
            return;
        }

        Node prev = null;
        Node pres = node;
        Node next = pres.next;
        tail = pres;

        while (pres != null) {
            pres.next =prev;
            prev = pres;
            pres = next;
            if(next != null) next = next.next;
        }

        head = prev;
        tail.next = null;
    }
    // public ListNode reverseList(ListNode head) {
    //     if (head == null || head.next == null) {
    //         return head;
    //     }

    //     ListNode newHead = reverseList(head.next);
    //     head.next.next = head;
    //     head.next = null;
    //     return newHead;
    // }
    public Node reversePortion(Node head, int left , int right) {
        /*
        Input: head = [1,2,3,4,5], left = 2, right = 4
        Output: [1,4,3,2,5]
        */

        if (head == null || head.next == null) return head;
        if (right == left) return head;

        Node previous = null;
        Node present = head;
        Node next = head .next;
        for (int i = 1; i < left; i++) {
            previous = present;
            present = next;
            next = next.next;
        }
        
        Node startLink = previous;
        Node start = present;
        while(left <= right) {
            present.next = previous;
            previous = present;
            present = next;
            if (next != null){
                next = next.next;
            }
            left++;
        }
        start.next = present;
        if (start == head) {
            head = previous;
        }
        else {
            startLink.next = previous;
        }

        return head;

    }
    // Sorting
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = middleNodeForSort(head);
        Node left = mergeSort(head);
        Node right = mergeSort(mid);

        head = mergeTwoLists(left, right);
        return head;
    }

    // Node class 
    private class Node{
        // Data members
        private int val;
        private Node next;

        // Constructors 
        public Node (){
            
        }
        public Node (int value){
            this.val = value;
        }
        public Node (int value , Node next) {
            this.val = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        CustomSinglyLinkedList list = new CustomSinglyLinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display();
        list.reversePortion(list.get(0), 2, 4);
        list.display();

    }
}
