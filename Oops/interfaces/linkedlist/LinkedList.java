package Oops.interfaces.linkedlist;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    // function for adding the node in the first of the linkedlist
    public void addFirst(int data) {
        // step1 -> create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {// incase of LinkedList is empty
            head = tail = newNode;
            return;
        }

        // step2 -> newNode next = head
        newNode.next = head;

        // step3 -> head = newNode
        head = newNode;
    }

    // function for adding the node in the last of the linkedlist
    public void addLast(int data) {
        // step1 -> create a new node
        Node newNode = new Node(data);
        size++;

        // if the linkedlist is empty
        if (head == null) {
            head = tail = newNode;
        }

        // step2 -> tail next = newNode
        tail.next = newNode;

        // step3 -> tail = newNode
        tail = newNode;
    }

    // function for adding the node between the linkedlist
    public void add(int index, int data) {
        // if we want to add the data in the begining then
        if (index == 0) {
            addFirst(data);
            return;
        }

        // otherwise
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        // i = index - 1-> temp = previous
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // function for remove the node from start of the linkedlist
    public int removeFirst() {
        // if the linked list is null
        if (size == 0) {
            System.out.println("The LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) { // if there is one node present in linkedlist
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // function for remove the node from last of the index
    public int removeLast() {
        // if the linked list is empty
        if (size == 0) {
            System.out.println("The LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) { // if there is one node present in linkedlist
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // previous Node -> i = size - 2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // function for searching the key in linkedlist
    public int iterativeSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    //function for recursive search in a linked list
    public int recursiveSearch(int key) {
        return helper(head, key);
    }
    // helper function for recursive search
    public int helper(Node head, int key) {
        // base case
        if(head == null) {
            return -1;
        }

        if(head.data == key) {
            return 0;
        }

        int index = helper(head.next, key);
        if (index == -1) {
            return -1;
        }

        return index + 1;
    }

    // function for reverse the linkedlist
    public void reverseLinkedList() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // function for find & remove the Nth node from end
    public void deleteNthFromEnd(int n) {
        // first we can find the size of the linkedlist
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // if n == size then we can remove the first node
        if(n == sz) {
            head = head.next;
        }

        Node prev = head;
        for (int i = 1; i < sz - n; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return;
    }

    // function for finding the mid by slow fast approach
    public Node findMid(Node head) { // this is an helper function
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // this is the mid node
    }

    public boolean checkPaliandrome() {
        // base case
        if(head == null || head.next == null){
            return true;
        }
        // step1 -> find middle
        Node midNode = findMid(head);  

        // step2 -> reverse second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node rightHead = prev; // this is the right half head
        Node leftHead = head;

        // step3 -> check left half and right half
        while (rightHead != null) {
            if(leftHead.data != rightHead.data) {
                return false;
            }
            rightHead = rightHead.next;
            leftHead = leftHead.next;
        }

        return true;
    }

    // function for check the linkedlist is forming a loop/cycle or not
    public static boolean isCycle() { // Floyd's cycle finding Algorithm
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if(slow == fast){
                return true; // cycle exist
            }
        }

        return false; // cycle doesn't exist
    }

    // function for removing the cycle from the linkedlist
    public static void removeCycle() {
        // detect the cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) { // that means cycle is not formed
            return;
        }
        

        //find the meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle -> last.next = null
        prev.next = null;
    }

    // function for Traversing the linkedlist and print the node of linkedlist
    public void Print() {
        // if the linkedlist is empty
        // if(head == null) {
        // System.out.println("LinkedList is Empty");
        // }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    // function for merge sort on linked list
    public Node mergeSort(Node head) {
        if(head == null || head.next == null){ // base case
            return head;
        }

        //step1 -> find the mid
        Node mid = getMid(head);

        //step2 -> right & left merge sort
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //step3 -> merge 
        return merge(newLeft, newRight);
    }
    // function for finding the mid node
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // function for merging the 2 linked list
    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if(head1.data <= head2.data){
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            } else {
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
        }

        while (head2 != null) {
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }

        return mergedLL.next;

    }

    // function for zigzag conversion of linkedlist
    public void zigZag() {
        // step1 -> find the mid
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //step2 -> reverse the second half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev ;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextLeft, nextRight;

        // step3 -> zigzag conversion
        while (left != null && right != null) {
            nextLeft = left.next;
            left.next = right;
            nextRight = right.next;
            right.next = nextLeft;

            left = nextLeft;
            right = nextRight;
        }
    }

    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();
        // ll.Print();

        // // adding the element in linkedlist and print the linkedlist
        // ll.addFirst(2);
        // ll.Print();
        // ll.addFirst(1);
         // ll.addLast(2);
        // ll.Print();
        // ll.addLast(1);
        // ll.Print();
        // ll.add(2, 3);
        // ll.Print();

        // // System.out.println("The remove node is " + ll.removeFirst());
        // // ll.Print();

        // // System.out.println("The remove node is " + ll.removeLast());
        // // ll.Print();

        // // System.out.println("The size of the LinkedList is " + ll.size);

        // // System.out.println(ll.recursiveSearch(3));
        // // System.out.println(ll.iterativeSearch(6));

        // // ll.reverseLinkedList();
        // // ll.Print();

        // // ll.deleteNthFromEnd(3);
        //  ll.Print();

        //  System.out.println(ll.checkPaliandrome());
        //  System.out.println(ll.isCycle());
        
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // System.out.println(isCycle());

        // removeCycle();
        // System.out.println(isCycle());


        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        //5->4->3->2->1->null

       
         ll.Print();
        // ll.head =ll. mergeSort(ll.head);
        // ll.Print();
        //O(nlogn)

        ll.zigZag();
        ll.Print();

        
    }
}
