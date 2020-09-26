package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        SortedLinkList list = new SortedLinkList();
        list.sortedInsert(1);
        list.sortedInsert(2);
        list.sortedInsert(2);
        list.sortedInsert(2);

        list.sortedInsert(3);
        list.sortedInsert(3);
        list.sortedInsert(3);

        list.sortedInsert(4);
        list.sortedInsert(5);

        list.removeDuplicates();

        list.printList();




    }
}
