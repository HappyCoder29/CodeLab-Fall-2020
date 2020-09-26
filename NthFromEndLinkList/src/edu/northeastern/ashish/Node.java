package edu.northeastern.ashish;

public class Node <T> {
    public T data;
    public Node next = null;

    private Node(){}

    public Node(T data){
        this.data = data;
    }

}
