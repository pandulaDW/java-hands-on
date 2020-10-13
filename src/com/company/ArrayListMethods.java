package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// can optionally specify initial cap

public class ArrayListMethods {
    static ArrayList<Integer> al1 = new ArrayList<>(20);
    static ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));

    public static void methods() {
        al1.add(10);
        al1.add(0, 5); // add element at given index
        al1.addAll(1, al2);
        System.out.println(al1); // [5, 50, 60, 70, 80, 90, 10]
        System.out.println(al1.contains(50)); // true
        System.out.println(al1.get(5)); // 90
        System.out.println(al1.indexOf(70)); // 3
        al1.add(5, 70);
        System.out.println(al1); // [5, 50, 60, 70, 80, 70, 90, 10]
        System.out.println(al1.lastIndexOf(70)); // 5
        al1.set(al1.size() - 1, 100); // replace last element with 100

        // iteration
        for (int i = 0; i < al1.size(); i++) {
            System.out.println(al1.get(i));
        }

        for (Integer el : al1) {
            System.out.println(el);
        }

        al1.forEach(System.out::println);
        al1.forEach(ArrayListMethods::show);

        Iterator<Integer> it = al1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    static void show(Integer n) {
        if (n > 60) System.out.println(n);
    }
}
