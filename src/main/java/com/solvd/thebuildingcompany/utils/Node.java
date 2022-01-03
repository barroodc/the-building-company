package com.solvd.thebuildingcompany.utils;

public class Node<T> { //should be private
    Node next;
    T data;
    public Node(T data) {
        this.data = data;
    }
}
