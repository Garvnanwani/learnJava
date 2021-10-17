package LinkedList;

// import classes.Pokemon;

class Node {
    // access modifier - public, private
    public int data;
    public Node next;

    // constructor
    public Node(int val) {
        data = val;
    }
}

// two problems
// - data can be int only - coz not generic - solved

public class LinkedList {

    public Node headNode;

    public static void main(String[] args) {
        Node l1 = new Node(10);
        // Pokemon p1 = new Pokemon();

        System.out.println(l1.data);

    }
}
