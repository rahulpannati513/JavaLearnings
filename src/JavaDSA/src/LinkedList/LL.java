package LinkedList;

import java.util.LinkedList;

public class LL {
    Node head;
    private int size;
    LL(){
        this.size= 0;
    }

    // Initializing the Node
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data =data;
            this.next=null;
            size++;

        }
    }

    //Adding elements to the LinkedList at head
    //Inserting at the index
    public  void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        //why we taken currNode as because if we use head to traverse the linked list we will lost the intial head and
        // it causes loss of information so we use a currNode it will traverse the linked list so no problem...
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    //printing all the linkedlist values
    public  void printList(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    //Deletion in a linkedlist
    public  void deleteFirst(){
        if( head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    public  void deleteLast(){

        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        Node secondlast = head;
        Node lastNode = head.next;// head.next = null  -> lastNode = null
        while(lastNode.next != null){ // null.next
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }

        secondlast.next = null;
    }
// size of a linkedlist

    public  int getSize(){
        return size;
    }
    public void reverseIterate(){
        if (head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        LL list = new LL();
//        list.addFirst("List");
//        list.addFirst("Linked");
//        list.printList();
        list.addLast("linked");
        list.addLast("list");
        list.addLast("last");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        list.reverseIterate();
        System.out.println( list.getSize());
    }
}
