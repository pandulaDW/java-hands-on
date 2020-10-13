package com.company;

// All methods coming from the collection and list interface is available

import java.util.*;

public class LinkedListMethods {
    public static void methods() {
        LinkedList<Integer> al1 = new LinkedList<>();
        LinkedList<Integer> al2 = new LinkedList<>(List.of(50, 60, 70));

        al1.add(10);
        al1.add(0, 5);
        al1.addAll(1, al2);
        al1.addFirst(2);
        al1.addLast(80);

        al1.forEach(n -> System.out.print(n + ", "));
    }
}