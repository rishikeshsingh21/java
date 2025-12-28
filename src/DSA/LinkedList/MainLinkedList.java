package DSA.LinkedList;

class Node{
    int data;
    Node next;
}

class LinkedList{
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }else {
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void insertAtStart(int data){

        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int idx,int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(idx == 0){
            insertAtStart(data);
        }else{
            Node n = head;
            while(idx>1){
                n = n.next;
                idx--;
            }
            node.next=n.next;
            n.next = node;
        }

    }

    public void deleteAt(int idx){
        if(idx == 0){
            head = head.next;
        }else{
            Node n = head;
            for (int i = 0; i < idx - 1; i++) {
                n = n.next;
            }
            System.out.println("Deleted:"+n.next.data);
            n.next = n.next.next;
        }
    }

    public void show(){
        Node n = head;

        while(n.next != null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.print(n.data+" ");
    }
}

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();

        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insertAtStart(0);
        obj.insertAt(3,40);
        obj.insert(50);
        obj.insertAt(5,39);
        obj.insertAt(0,100);
        obj.deleteAt(6);
        obj.show();
    }
}
