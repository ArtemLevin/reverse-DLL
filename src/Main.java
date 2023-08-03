class dList {
    Node head;
    Node tail;

    class Node {
        int value;
        Node next;
        Node prev;
    }

    void push_front(int value) {
        Node node = new Node();
        node.value = value;

        if (head == null) {
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
        }
        head = node;
    }


    void print() {
        Node cur = head;
        while (cur != null) {
            System.out.printf("%d ", cur.value);
            cur = cur.next;
        }
        System.out.println();
    }


    public void reverseDList() {
        Node leftSide = head;
        Node rightSide = tail;
        Node tempNode = new Node();
        int counter = 0;
        while(leftSide.prev != rightSide) {
            tempNode.value = rightSide.value;
            rightSide.value = leftSide.value;
            leftSide.value = tempNode.value;
            leftSide = leftSide.next;
            rightSide = rightSide.prev;
            counter ++;
        }

    }
}


public class Main {
    public static void main(String[] args) {
        dList list = new dList();
        for (int i = 1; i <= 20; i++)
            list.push_front(i);

        list.print();
        list.reverseDList();
        list.print();

    }
}
