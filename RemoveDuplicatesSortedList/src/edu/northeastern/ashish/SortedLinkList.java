package edu.northeastern.ashish;

public class SortedLinkList{

    public Node head;

    public SortedLinkList() {
        head = null;

    }

    public void sortedInsert(Integer data){
        Node add = new Node(data);
        if(head == null){
            head = add;
            return;
        }

        if(add.data < head.data ){
            add.next = head;
            head = add;
            return;
        }

        Node temp = head;
        while(temp.next  != null &&  temp.next.data < data ){
            temp = temp.next;
        }
        add.next = temp.next;
        temp.next = add;

    }

    public void removeDuplicates(){
        if(head == null || head.next == null){
            return;
        }

        Node temp = head;
        while(temp.next != null ){
            if(temp.next.data == temp.data){
                Node del = temp.next;
                temp.next = del.next;
                del = null;
            }else{
                temp = temp.next;
            }
        }
    }

    public void printList(){
        if(head == null){
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("Null");

    }

}
