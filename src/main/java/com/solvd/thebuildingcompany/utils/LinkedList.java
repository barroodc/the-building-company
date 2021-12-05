package com.solvd.thebuildingcompany.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedList<T> {
    private static final Logger logger = LogManager.getLogger(ApacheWordCalculation.class);


    Node head;

    public void append(T data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        current.next = new Node(data);
    }

    public void prepend(T data) {
        Node brandNewHead = new Node(data);
        brandNewHead.next = head;
        head = brandNewHead;
    }

    public void deleteWithValue(T data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
               current.next = current.next.next;
               return;
            }
            current = current.next;
        }
    }

    /*public static void main(String[] args) {
        java.util.LinkedList <String> list = new java.util.LinkedList<>();
        list.add("Snake");
        list.add("Shake");
        list.add("Bake");
        logger.info(list);
    }

     */
}
