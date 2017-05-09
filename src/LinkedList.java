/**
 * Created by PARTHAS on 5/9/2017.
 */
public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public void insertBeg(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    public void insertAfter(Node prev, int data){
        Node temp = new Node(data);
        temp.next = prev.next;
        prev.next = temp;
    }
    public void insertEnd(int data){
        Node temp = new Node(data);
        if (head == null){
            head = temp;
            return;
        }
        Node check = head;
        while (check.next != null){
            check = check.next;
        }
        check.next = temp;
    }
    public void traverse(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        list.head.next = second;
        second.next = third;
        list.insertAfter(second, 6);
        list.insertEnd(8);
        list.traverse();
    }
}
