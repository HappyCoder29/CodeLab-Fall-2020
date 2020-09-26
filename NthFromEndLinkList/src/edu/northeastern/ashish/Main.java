package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        LinkList<Integer> list = new LinkList<>();
        list.addTail(0);
        list.addTail(1);
        list.addTail(2);
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);

        Node<Integer> node = list.nThFromEnd(6);
        if(node != null){
            System.out.println(node.data);
        }



    }
}
