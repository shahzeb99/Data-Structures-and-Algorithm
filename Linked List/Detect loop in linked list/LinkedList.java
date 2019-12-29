import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} 

class LinkedList {
    Node head; // head of list
    /* Linked list Node*/
    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
        /* 1 & 2: Allocate the Node & Put in the data*/
        Node new_node = new Node(new_data);
        /* 3. Make next of new Node as head */
        new_node.next = head;
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
    /* Drier program to test above functions */
    public static void main(String args[]) {
        int t, d, n, i, x, c;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (d = 0; d < t; d++) {
            n = sc.nextInt();
            LinkedList llist = new LinkedList();
            Node q;
            for (i = 0; i < n; i++) {
                x = sc.nextInt();
                llist.push(x);
            }
            Node p;
            p = llist.head;
            q = llist.head;
            while (q.next != null) q = q.next;
            c = sc.nextInt();
            if (c > 0) {
                c = c - 1;
                for (i = 0; i < c; i++) {
                    p = p.next;
                }
                q.next = p;
            }
            if (new Loop().detectLoop(llist.head) == 1)
                System.out.print("True\n");
            else
                System.out.print("False\n");
            // System.gc();
        }
    }
}
/*This is a function problem.You only need to complete the function given below*/
/* Node is defined as
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/
class Loop
{
    int detectLoop(Node head) 
    {
        // Add code here
        Node temp1=head;
        Node temp2=head;
        while(temp1 != null && temp2!=null && temp2.next != null)
        {
            temp1=temp1.next;
            temp2=temp2.next.next;
            if(temp1==temp2)
            {
                return(1);
            }
            
        }
        return 0;
    }
}
