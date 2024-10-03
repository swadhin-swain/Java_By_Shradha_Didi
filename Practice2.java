
public class Practice2 {
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

    // function for recursive search in a linked list
    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    // helper function for recursive search
    public int helper(Node head, int key) {
        // base case
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
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
        if (n == sz) {
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

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // this is the mid node
    }

    public boolean checkPaliandrome() {
        // base case
        if (head == null || head.next == null) {
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
            if (leftHead.data != rightHead.data) {
                return false;
            }
            rightHead = rightHead.next;
            leftHead = leftHead.next;
        }

        return true;
    }

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

    // function for detecting the loop or cycle
    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // mergesort of linked list
    public Node MergeSort(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }
        // step 1
        Node mid = getMid(head);

        // step2
        Node right = mid.next;
        mid.next = null;

        Node newleft = MergeSort(head);
        Node newright = MergeSort(right);

        // step 3

        return Merge(newleft, newright);

    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    private Node Merge(Node left, Node right) {
        Node ll = new Node(-1);
        Node temp = ll;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
                temp = temp.next;

            } else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }

        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return ll.next;

    }

    // function for zig zag conversion
    public void zigZag() {
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        // revrse the second half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // create the zig zag pattern
        Node left = head;
        Node right = prev;
        Node newLeft, newRight;

        while (left != null && right != null) {
            newLeft = left.next;
            left.next = right;
            newRight = right.next;
            right.next = newLeft;

            left = newLeft;
            right = newRight;
        }
    }

    public static void main(String[] args) {
        Practice2 ll = new Practice2();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);

        ll.Print();

        ll.head = ll.MergeSort(ll.head);
        ll.Print();
        ll.zigZag();
        ll.Print();
    }
}