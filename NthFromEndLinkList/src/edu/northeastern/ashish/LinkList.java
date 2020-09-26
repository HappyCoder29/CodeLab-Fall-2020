package edu.northeastern.ashish;

public class LinkList <T> {

    public Node<T> head;

    public LinkList() {
        head = null;

    }

    // assuming there is no cycle
    public void addTail(T data){
        Node add = new Node(data);

        if(head == null){
            head = add;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = add;
    }

    // Assuming there is no cycle
    public Node<T> nThFromEnd(int n){
        if(n < 0){
            return  null;
        }

        if(head == null){
            return head;
        }

        Node<T> front = head;
        Node<T> back = head;

        // Move head by n

        for(int i = 0 ; i < n ; i ++){
            if(front == null){

                if( i <= n){
                    return null;
                }

                break;
            }
            front = front.next;
        }

        while(front != null){
            front = front.next;
            back = back.next;
        }

        return  back;

    }
}
